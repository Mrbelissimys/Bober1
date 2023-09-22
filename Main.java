//1
class Test {
    public static void main(String args[]){
        int k;
        double r;
        r = 0.4;
        k = 5;
        System.out.println (k+r);
        System.out.println (k-r);
        System.out.println (k*r);
        System.out.println (k/r);
    }
}

//2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.print("Введите целое число: ");
        int c = scanner.nextInt();


        System.out.println(a*b*c);
    }
}


//4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число: ");
        int b = scanner.nextInt();

        System.out.print("Площядь: ");
        System.out.println(a * b);
        System.out.print("Периметр: ");
        System.out.println((a * b) * 2);
    }
}

//5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();

        System.out.print("4islox2: ");
        System.out.println((a/2+1)*2);
    }
}


//6


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите  число RYBlb: ");
        int a = scanner.nextInt();
        System.out.print("Введите  число kopeek: ");
        float b = scanner.nextInt();
        System.out.print("Введите целое число pir04kov: ");
        int n = scanner.nextInt();


        System.out.print("RYBlb: ");
        System.out.println((a+(b/100))*n);
    }
}

//7

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите  число : ");
        int a = scanner.nextInt();
        char[] b = String.valueOf(a).toCharArray();
        int c = b.length-1;
        System.out.println(b[c]);
    }
}

//8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите  число : ");
        int a = scanner.nextInt();
        char[] b = String.valueOf(a).toCharArray();

        int x = Integer.parseInt(String.valueOf(b[0]));
        int u = Integer.parseInt(String.valueOf(b[1]));
        int n = Integer.parseInt(String.valueOf(b[2]));


        System.out.println(x+u+n);
    }
}

//9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите  число km/h: ");
        int v = scanner.nextInt();
        System.out.print("Введите  число h: ");
        int t = scanner.nextInt();
        int kh = v*t;
        if(v<0) {
        }
        if(kh >= 108) {
            kh = 108;
        }
        if(kh <= -108) {
            kh = -108;
        }
        System.out.print(kh);
        }

    }

//10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите  число h: ");
        int h = scanner.nextInt();
        System.out.print("podnalosb a: ");
        int a = scanner.nextInt();
        System.out.print("cpystilasb b: ");
        int b = scanner.nextInt();
        int f = h / (a - b);
        System.out.print(f);

    }
}