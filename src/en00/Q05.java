/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en00;

/**
 *
 * @author takamasa
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class  Q05{
    public static void main(String args[]) {

        //現在日時を取得する
        Calendar c = Calendar.getInstance();

        //フォーマットパターンを指定して表示する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 (E)");
        System.out.print(sdf.format(c.getTime()));

        //フォーマットパターン変更して表示する
        sdf.applyPattern("  HH時mm分ss秒");
        System.out.println(sdf.format(c.getTime()));

    }
}