using System.Text;

namespace Algorithm_Practice
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] nm = Console.ReadLine().Split(" ");

            int[] basket = new int[int.Parse(nm[0]) + 1];
            for (int i = 1; i < basket.Length; i++)
            {
                basket[i] = i;
            }

            for (int i = 0; i < int.Parse(nm[1]); i++)
            {
                string[] str = Console.ReadLine().Split(" ");
                int temp = basket[int.Parse(str[1])];
                basket[int.Parse(str[1])] = basket[int.Parse(str[0])];
                basket[int.Parse(str[0])] = temp;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < basket.Length; i++)
            {
                sb.Append(basket[i] + " ");
            }

            Console.WriteLine(sb.ToString());
        }
    }
}

