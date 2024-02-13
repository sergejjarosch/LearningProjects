package array;

import java.awt.*;
import java.util.Arrays;

public class array_46 {
    public static void output_array_46() {
        Point[] player = new Point[ 5 ];

        for ( int i = 0; i < player.length; i++)
            player[ i ] = new Point ( (int) (Math.random() * 40  ),
                                      (int) (Math.random() * 10) );
        for ( int y = 0; y < 10; y++) {
            for ( int x = 0; x < 40; x++ )
                if (Arrays.asList( player).contains( new Point( x,y ) ) )
                    System.out.print( '&');
            else
                    System.out.print('.');
            System.out.println();
        }
    }
}
