public class MultArray {

    public static void main( String [] args ) {
        int [][] m_arr = new int[4][];

        int [] m_siz = {5,2,3,10};

        m_arr[0] = new int[m_siz[0]];
        m_arr[1] = new int[m_siz[1]];
        m_arr[2] = new int[m_siz[2]];
        m_arr[3] = new int[m_siz[3]];

        for(int i = 0; i < 4 ; i++ ) {
            for( int j = 0; j < m_siz[i]; j++ ) {
               m_arr[i][j] = (int) (Math.random() * 20);
            }
        }
        for(int i = 0; i < 4 ; i++ ) {
            System.out.print(i+", "+m_siz[i]+"\t[ ");
            for( int j = 0; j < m_siz[i]; j++ ) {
                 System.out.print(" "+m_arr[i][j]);
            }
            System.out.println(" ] ");
        }

    }
}
