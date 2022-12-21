public class switchTest{
    
    public static void main(String[] args) {
        methodSwitch();
    }
    private static void methodSwitch() {
        int number	=	2;
            switch (number)	{
            case 1:
                System.out.println(1);
                break;
            case 2:
            break;
            case 3:
                System.out.println("Number	is	2	or	3");
                break;
            default:
                System.out.println("Default");
                break;
            }
            for (int i	=	0,j	=	0;	i	<	10;	i++,j--)	{
				System.out.print(j);
}
            outer:
                for (int j	=	0;	j	<	2;	j++)	{
                                for (int k	=	0;	k	<	10;	k++)	{
                                                System.out.print(j	+	"" +	k);
                                                if (k	==	5)	{
                                                                break outer;//Takes	out	of	loop	using	j
                                                }
                                }
                }
    }
}