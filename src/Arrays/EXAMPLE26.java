package Arrays;

public class EXAMPLE26
{
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        // Space : 0(N)
        int[] col = new int[3];

        // Space 0(M)
        int[] row = new int[3];

        // Time: 0(N*M)
        for(int i=0; i < matrix.length; i++)
        {
            for(int j=0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    col[j] = 1;
                    row[i] = 1;
                }
            }
        }


        // Time: 0(N)
        // Fills The Rows
        for(int i=0; i < col.length; i++)
        {
            if(row[i] == 1)
            {
                fillRowsWithZeros(matrix,i);
            }
        }

        // Time: 0(M)
        // Fill The Cols
        for(int i=0; i < row.length; i++)
        {
            if(col[i] == 1)
            {
                fillColsWithZeros(matrix,i);
            }
        }


        // Total Time :0(N*M) + 0(N) + 0(M) === 0(N^2)
        // Total Time : 0(N)  + 0(M) ==== 0(N)
        for(int i=0; i < matrix.length; i++)
        {
            for(int j=0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

    }

    private static void fillColsWithZeros(int[][] matrix, int j)
    {
        for(int k=0; k < matrix.length; k++)
        {
            matrix[k][j] = 0;
        }
    }

    private static void fillRowsWithZeros(int[][] matrix, int i)
    {
        for(int k=0; k < matrix[i].length; k++)
        {
            matrix[i][k] = 0;
        }
    }
}
