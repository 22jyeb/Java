public class Game {
    static final int FGVALUE = 20;
    static final int GSVALUE = 16;
    static final int FGLIFE = 30;
    static final int GSLIFE = 20;

    public static void main(String[] args) {
        int goldcoin = 100;
        int fg_num = 0, gs_num = 0;
        int max_life = 0;
        System.out.println("�������ҵ�����Ϊ��");
        Scanner in = new Scanner(System.in);
        goldcoin = in.nextInt();

        int fg_loop;
        for (fg_loop = 0; fg_loop <= (goldcoin / FGVALUE); fg_loop++) {
            int gs_loop;
            for (gs_loop = 0; gs_loop <= (goldcoin / GSVALUE); gs_loop++) {
                if (((fg_loop * FGVALUE + gs_loop * GSVALUE) <= goldcoin)
                        && ((FGLIFE * fg_loop + GSLIFE * gs_loop) > max_life)) {
                    fg_num = fg_loop;
                    gs_num = gs_loop;
                    max_life = FGLIFE * fg_loop + GSLIFE * gs_loop;
                }
            }
        }

        System.out.println("����ı��������������" + max_life + "����������");
        System.out.println("�������Ů�ݵ�����Ϊ" + fg_num);
        System.out.println("���������������" + gs_num);
    }
}
