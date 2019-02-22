package com.jou.model;
import com.jou.model.StringUtil;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Hash table based implementation of the <tt>Map</tt> interface.  This
 * implementation provides all of the optional map operations, and permits
 * <tt>null</tt> values and the <tt>null</tt> key.  (The <tt>TypedMap</tt>
 * class is roughly equivalent to <tt>Hashtable</tt>, except that it is
 * unsynchronized and permits nulls.)  This class makes no guarantees as to
 * the order of the map; in particular, it does not guarantee that the order
 * will remain constant over time.
 *
 * <p>This implementation provides constant-time performance for the basic
 * operations (<tt>get</tt> and <tt>put</tt>), assuming the hash function
 * disperses the elements properly among the buckets.  Iteration over
 * collection views requires time proportional to the "capacity" of the
 * <tt>TypedMap</tt> instance (the number of buckets) plus its size (the number
 * of key-value mappings).  Thus, it's very important not to set the initial
 * capacity too high (or the load factor too low) if iteration performance is
 * important.
 *
 * <p>An instance of <tt>TypedMap</tt> has two parameters that affect its
 * performance: <i>initial capacity</i> and <i>load factor</i>.  The
 * <i>capacity</i> is the number of buckets in the hash table, and the initial
 * capacity is simply the capacity at the time the hash table is created.  The
 * <i>load factor</i> is a measure of how full the hash table is allowed to
 * get before its capacity is automatically increased.  When the number of
 * entries in the hash table exceeds the product of the load factor and the
 * current capacity, the hash table is <i>rehashed</i> (that is, internal data
 * structures are rebuilt) so that the hash table has approximately twice the
 * number of buckets.
 *
 * <p>As a general rule, the default load factor (.75) offers a good tradeoff
 * between time and space costs.  Higher values decrease the space overhead
 * but increase the lookup cost (reflected in most of the operations of the
 * <tt>TypedMap</tt> class, including <tt>get</tt> and <tt>put</tt>).  The
 * expected number of entries in the map and its load factor should be taken
 * into account when setting its initial capacity, so as to minimize the
 * number of rehash operations.  If the initial capacity is greater
 * than the maximum number of entries divided by the load factor, no
 * rehash operations will ever occur.
 *
 * <p>If many mappings are to be stored in a <tt>TypedMap</tt> instance,
 * creating it with a sufficiently large capacity will allow the mappings to
 * be stored more efficiently than letting it perform automatic rehashing as
 * needed to grow the table.
 *
 * <p><strong>Note that this implementation is not synchronized.</strong>
 * If multiple threads access a hash map concurrently, and at least one of
 * the threads modifies the map structurally, it <i>must</i> be
 * synchronized externally.  (A structural modification is any operation
 * that adds or deletes one or more mappings; merely changing the value
 * associated with a key that an instance already contains is not a
 * structural modification.)  This is typically accomplished by
 * synchronizing on some object that naturally encapsulates the map.
 *
 * If no such object exists, the map should be "wrapped" using the
 * {@link Collections#synchronizedMap Collections.synchronizedMap}
 * method.  This is best done at creation time, to prevent accidental
 * unsynchronized access to the map:<pre>
 *   Map m = Collections.synchronizedMap(new TypedMap(...));</pre>
 *
 * <p>The iterators returned by all of this class's "collection view methods"
 * are <i>fail-fast</i>: if the map is structurally modified at any time after
 * the iterator is created, in any way except through the iterator's own
 * <tt>remove</tt> method, the iterator will throw a
 * {@link ConcurrentModificationException}.  Thus, in the face of concurrent
 * modification, the iterator fails quickly and cleanly, rather than risking
 * arbitrary, non-deterministic behavior at an undetermined time in the
 * future.
 *
 * <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
 * as it is, generally speaking, impossible to make any hard guarantees in the
 * presence of unsynchronized concurrent modification.  Fail-fast iterators
 * throw <tt>ConcurrentModificationException</tt> on a best-effort basis.
 * Therefore, it would be wrong to write a program that depended on this
 * exception for its correctness: <i>the fail-fast behavior of iterators
 * should be used only to detect bugs.</i>
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 *
 * @author  Doug Lea
 * @author  Josh Bloch
 * @author  Arthur van Hoff
 * @author  Neal Gafter
 * @see     Object#hashCode()
 * @see     Collection
 * @see     Map
 * @see     TreeMap
 * @see     Hashtable
 * @since   1.2
 */

public class TypedMap<K,V> 
    extends LinkedHashMap<K,V> implements java.io.Serializable
    
{
DecimalFormat df = new DecimalFormat("#,##0.00");

    public TypedMap() {
        super();
    }
    public TypedMap(Map param){
        super();
        readParameterMap(param);
    }
//    public TypedMap(JSONObject json) throws JSONException{
//        super();
//        Iterator keys = json.keys();        
//        while(keys.hasNext()){
//            String key=keys.next().toString();            
//            put((K)key,(V)json.get(key));
//        }
//    }

    public final void readParameterMap(Map<String,String[]> m){
        for (Map.Entry<String,String[]> e : m.entrySet()){
            if(e.getKey().endsWith("][]")){
                String key = e.getKey().substring(0, e.getKey().indexOf("["));
                String subkey = e.getKey().substring(e.getKey().indexOf("[")+1,e.getKey().length()-3);
                if(get((K)key)==null){
                    put((K)key,(V)new TypedMap());
                }
                TypedMap map = (TypedMap)get((K)key);
                map.put(subkey,e.getValue());
            }else if(e.getKey().endsWith("[]")){
                put((K)e.getKey().replace("[]",""), (V)e.getValue());
            }else if(e.getKey().endsWith("]")){
                String key = e.getKey().substring(0, e.getKey().indexOf("["));
                String subkey = e.getKey().substring(e.getKey().indexOf("[")+1,e.getKey().length()-1);
                if(get((K)key)==null){
                    put((K)key,(V)new TypedMap());                    
                }
                TypedMap map = (TypedMap)get((K)key);
                map.put(subkey,e.getValue()[0]);
            }else
                put((K)e.getKey(), (V)e.getValue()[0]);
        }
    }

    public V g(K key) {
        return super.get(key); 
    }
   
  public String gStr(K k){
      return gStr(k,"");
  }
  public String gStr(K k,String nvl){
      if (this.g(k)==null)return nvl;
      if(this.g(k) instanceof String[]) return StringUtil.join((String[])this.g(k),",");
      return this.g(k).toString();
  } 
  public int gInt(K k){
      if (this.g(k)==null)return 0;
      try{
      return (Integer)this.g(k);
      }catch(Exception ex){}
      try{
      return Integer.parseInt(this.gStr(k));
      }catch(Exception ex){}
      return 0;
  }
  public double gDouble(K k){
      if (this.g(k)==null)return 0;
      try{
      return Double.parseDouble(this.gStr(k).trim().replace(",", ""));
      }catch(Exception ex){}
      return 0;
  }
  public String gDecimal(K k){
      
      return df.format(this.gDouble(k));
  }
  public Date gDate(K k){
      if(this.g(k)==null)return new Date();
      if(k instanceof Date){
        return (Date)this.g(k);
      }else if(k instanceof String){
          return new Date(this.gStr(k));
      }
      return new Date();
  }
  public Date gDate(K k,String format){
      if(this.g(k)==null)return new Date();
      try{
          return new Date();
      }catch(Exception ex){
      }
      return new Date();
  }
  public String gDateToString(K k,String tostringFormat){
      if(this.g(k)==null||"".equals(this.gStr(k)))return "";
      try{
          return new Date(this.gStr(k)).toString();
      }catch(Exception ex){
      }
      return "";
  }
  public String gDateToString(K k,String tostringFormat,Locale locale){
      if(this.g(k)==null)return "";
      try{
          return new Date(this.gStr(k)).toString();
      }catch(Exception ex){
      }
      return "";
  }
  public String gDateToString(K k,String format,String tostringFormat){
      if(this.g(k)==null)return "";
      try{
          return new Date().toString();
      }catch(Exception ex){
      }
      return "";
  }
}
