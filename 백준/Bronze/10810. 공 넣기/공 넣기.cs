using System.Text;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] nm = Console.ReadLine().Split(" ");
            int n = int.Parse(nm[0]);   // 바구니 개수
            int m = int.Parse(nm[1]);   // 공 넣는 횟수

            int[] basket = new int[n+1];

            for (int a = 0; a < m; a++)
            {
                string[] str = Console.ReadLine().Split(" ");
                int i = int.Parse(str[0]);
                int j = int.Parse(str[1]);
                int k = int.Parse(str[2]);

                for (int b = i; b <= j; b++)
                {
                    basket[b] = k;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int a = 1; a <= n; a++)
            {
                sb.Append(basket[a] + " ");
            }

            Console.WriteLine(sb.ToString());
        }
    }
}

