/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.Console;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NxcodeCreate {

    private boolean validcode = false;

    public static void main(String args[]) {
        Console con = System.console();
        Scanner scn = new Scanner(System.in);
        System.out.println("--------NxCode Serial Number Creator--------");
        int i = 0;
        while (true) {
            try {
                System.out.println("Please select type, type 1--CASH, type 2--ITEM");
                i = Integer.parseInt(scn.next());
                System.out.println();
                break;
            } catch (Exception e) {
                //System.err.println(e);
            }
        }

        switch (i) {
            case 1:
                creat_Cash(scn);
                break;
            case 2:
                creat_Item(scn);
                break;
        }

        //getNXCodeValid();
    }

    public static void creat_Cash(Scanner scn) {
        int n = 0;
        String s = "";
        while (true) {
            System.out.println("Serial Number Quantity?  (max 5)");
            s = scn.next();
            if (isDigi(s)) {
                n = Integer.parseInt(s);
                if (n < 1 || n > 5) {
                    continue;
                }
                break;
            }

        }

        int i = 1;
        int cash = 0;
        String code;

        while (i <= n) {
            int type = 0;
            System.out.println("  Please select type, type 0--nxCredit, type 1--nxPrepaid, type 2--maplePoint");
            s = scn.next();
            if (isDigi(s)) {
                type = Integer.parseInt(s);
                if (type != 0 && type != 1 && type != 2) {
                    continue;
                }
            }

            System.out.println("Serial Number " + i + " Cash amount ?");
            s = scn.next();
            if (isDigi(s)) {
                cash = Integer.parseInt(s);
                code = creat_Code();
                if (upload_data(code, type, cash)) {
                    System.out.println(code + "　　CASH：" + cash);
                    i++;
                }
            }
        }
    }

    public static boolean upload_data(String code, int type, int item) {
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO nxcode (code,valid, type, item) VALUES (?,0,?,?)");
            ps.setString(1, code);
            ps.setInt(2, type);
            ps.setInt(3, item);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public static String creat_Code() {
        String s = "";
        int l = 0; //Lower case
        int u = 0; //Upper case
        int n = 0; //Number
        int c=0;
        for (int i = 1; i <= 15; i++) {
            int r = (int) (Math.random() * 3 + 1);
            switch (r) {
                case 1:
                    if (l >= 5) {
                        i--;
                        continue;
                    }
                    r = (int) (Math.random() * 26 + 97);
                    s += (char) r;
                    l++;
                    break;
                case 2:
                    if (u >= 5) {
                        i--;
                        continue;
                    }
                    r = (int) (Math.random() * 26 + 65);
                    s += (char) r;
                    u++;
                    break;
                case 3:
                    if (n >= 5) {
                        i--;
                        continue;
                    }
                    r = (int) (Math.random() * 10 + 48);
                    s += (char) r;
                    break;
            }
            c++;
        }
        System.out.println(c);
        return s;
    }

    public static void creat_Item(Scanner scn) {
        int n = 0;
        String s = "";
        while (true) {
            System.out.println("Serial Number Quantity?  (max 5)");
            s = scn.next();
            if (isDigi(s)) {
                n = Integer.parseInt(s);
                if (n < 1 || n > 5) {
                    continue;
                }
                break;
            }

        }

        int i = 1;
        int cash = 0;
        String code;

        while (i <= n) {
            System.out.println("Serial Number " + i + " Item ID ?");
            s = scn.next();
            if (isDigi(s)) {
                cash = Integer.parseInt(s);
                code = creat_Code();
                if (upload_data(code, 4, cash)) {
                    System.out.println(code + "　　ITEM ID：" + cash);
                    i++;
                }
            }
        }

    }

    public static boolean getNXCodeValid(String code) {
        boolean inSQL = false;
        try {
            PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("SELECT `code` FROM nxcode");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("code").equals(code)) {
                    inSQL = true;
                }
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return inSQL;
    }

    public static boolean isDigi(String s) {
        try {
            int a = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
