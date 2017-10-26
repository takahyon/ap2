/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi02;

public class Tweet {

    //フィールド
    private int tweetNo;	//ツイートの番号
    private String twitterID;	//twitterID
    private String name;	//氏名
    private String tweetTime;	//投稿日時
    private String text;	//投稿内容

    //コンストラクタ
    public Tweet() {
        //とりあえず何もしない
    }
    
    //ツイート番号をセットするメソッド
    public void setNo(int tn) {
        this.tweetNo = tn;
    }

    //twitterIDをセットするメソッド
    public void setTID(String tid) {
        this.twitterID = tid;
    }

    //氏名をセットするメソッド
    public void setName(String name){
        this.name=(name);
    }
    //投稿日時をセットするメソッド
    public void setTime(String time){
        this.tweetTime=time;
    }
    //投稿内容をセットするメソッド
    public void setText(String text){
        this.text=text;
    }

    //ツイート情報を出力するメソッド
    public void printTweet() {
        System.out.println(tweetNo + ":" 
                + twitterID + "(" + name + ")\n"
                + tweetTime + "\n" + text);
    }
}
