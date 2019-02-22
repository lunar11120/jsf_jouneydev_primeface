package com.jou.model;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;

/**
 * @author MR Aekasit Sengnualnim (Aek) Senior Software Developer
 *
 * SSC Solutions Co., Ltd. 333 Lao Peng Nguan Tower 1, 27th A Floor,
 * Viphavadee-Rangsit Road, Jomphol, Jatujak, Bangkok 10900 Thailand Tel :+66
 * (0) 2618 8638-9 Fax :+66 (0) 2618 8640 Mobile : +66 8912 90006 Skype :
 * s.aekasit Email : aekasit@tsoc.co.th / aekasit@sscs.co.th MSN :
 * s.aekasit@hotmail.com http://www.sscs.co.th/
 *
 * @create 02-11-2555 23:38:31
 */
public class StringUtil {

    public static boolean isNullOrEmpty(String p_string) {
        boolean result = false;
        if (p_string == null || p_string.length() == 0) {
            result = true;
        }
        return result;
    }

    public static boolean isNullOrEmpty(Object oj) {
        boolean result = false;
        if (oj == null) {
            result = true;
        }
        return result;
    }

    public static boolean isNotNullOrNotEmpty(String p_string) {
        boolean result = false;
        if (p_string != null && p_string.length() != 0) {
            result = true;
        }
        return result;
    }

    public static boolean isNotNullOrNotEmpty(Object oj) {
        boolean result = false;
        if (oj != null) {
            result = true;
        }
        return result;
    }

    public static String numberFormat(int id, String patt) {
        NumberFormat formatter = new DecimalFormat(patt);
        return formatter.format(id);
    }

    public static String formatt() {
        DecimalFormatSymbols phoneNumberSymbols = new DecimalFormatSymbols();
        phoneNumberSymbols.setGroupingSeparator('-');


        DecimalFormat phoneNumberFormat = new DecimalFormat("###-####-###", phoneNumberSymbols);
        System.out.println("Some mobile number:" + phoneNumberFormat.format(910041009L));
        return "";
    }

    public static String strWhereIn(String[] str) {
        String v = "";
        if (isNotNullOrNotEmpty(str)) {
            v = "";
            for (int i = 0; i < str.length; i++) {
                v = v + "'" + str[i] + "',";
            }
            v = v.substring(0, v.length() - 1);
        }
        return v;
    }

    public static String strWhereIn(List<String> str) {
        String v = "";
        if (str.size() > 0) {
            v = "";
            for (int i = 0; i < str.size(); i++) {
                v = v + "'" + str.get(i) + "',";
            }
            v = v.substring(0, v.length() - 1);
        }
        return v;
    }

    public static char getCharForString(String value) {
        return value.toCharArray()[0];
    }

    public static String getFundFromSumSubFund(List<SumSubFundShowTO> sumSubFundList) {
        String output = "";
        if (sumSubFundList.size() > 0) {
            for (int i = 0; i < sumSubFundList.size(); i++) {
                SumSubFundShowTO to = (SumSubFundShowTO) sumSubFundList.get(i);
                output = output + to.getSumSubFundShowTOPK().getSubFund() + ",";
            }
            if (output.length() > 0) {
                output = output.substring(0, output.length() - 1);
            }
        }
        return output;
    }

    public static Double getSumTotalAMTFromSumSubFund(List<SumSubFundShowTO> sumSubFundList) {
        Double output = 0.0;
        if (sumSubFundList.size() > 0) {
            for (int i = 0; i < sumSubFundList.size(); i++) {
                SumSubFundShowTO to = (SumSubFundShowTO) sumSubFundList.get(i);
                output = output + to.getTotlAmt();
            }
        }
        return output;
    }
    
    public static String join(String[] s, String delimiter) {
     StringBuilder builder = new StringBuilder();
     for(int i=0;i<s.length;i++){
         builder.append(s[i]);
         if(i==s.length-1){
             break;
         }
         builder.append(delimiter);
     }
     return builder.toString();
    }
    
    public static String getStringForChar(Character value) {
        if (value != null) {
            return value.toString();
        } else {
            return "";
        }
    }
    
    public static String mRegisterDW(String[] str) {
        String dw = "";
        if (isNotNullOrNotEmpty(str)) {
            for (int i = 0; i < str.length; i++) {
                if (str[i] != null) {
                    dw = dw + str[i] + ",";
                } else {
                    dw = dw + "N,";
                }
            }
            if (dw.length() > 0) {
                dw = dw.substring(0, dw.length() - 1);
            }
        }
        return dw;
    }

    public static void main(String[] args) {
        String[] aa = new String[3];
        aa[0] = "aaaa";
        aa[1] = "bbbb";
        aa[2] = "cccc";
        System.out.println(strWhereIn(aa));
    }
}
