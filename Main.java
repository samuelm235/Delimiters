import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Delimiters e1 = new Delimiters("(", ")");
        String[] t1 = {"(", "x + y", ")"," * 5"};
        System.out.println(e1.getDelimitersList(t1));
        Delimiters e2 = new Delimiters("<q>", "</q>");
        String[] t2 = {"<q>", "yy", "</q>","zz", "</q>"};
        System.out.println(e2.getDelimitersList(t2));
        Delimiters e3 = new Delimiters("<sup>", "</sup>");
        String[] t3 = {"<sup>", "<sup>", "</sup>","<sup>", "</sup>", "</sup>"};
        System.out.println(e3.isBalanced(e3.getDelimitersList(t3)));
        String[] t4 = {"<sup>", "</sup>", "</sup>","<sup>"};
        System.out.println(e3.isBalanced(e3.getDelimitersList(t4)));
        String[] t5 = {"</sup>"};
        System.out.println(e3.isBalanced(e3.getDelimitersList(t5)));
        String[] t6 = {"<sup>", "<sup>", "</sup>"};
        System.out.println(e3.isBalanced(e3.getDelimitersList(t6)));

    }
}