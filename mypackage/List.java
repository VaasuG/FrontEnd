import java.util.*;
class List {
    int arr[];
    int size;
        
    List() {
        size = 0;
        arr = null;
    }
    
    List(int len) {
        size = len;
        arr = new int[size];
    }
    
    List unCommon(List l) {
        List a = new List(this.size + l.size);
        int k = 0;
        boolean flag = false;
        for(int i = 0; i < this.size; i++) {
            flag = true;
            for(int j = 0; j < l.size; j++) {
                if(this.arr[i] == l.arr[j]) {
                     flag = false;
                     a.size--;
                     break;
                }
            }
            if(flag) a.arr[k++] = this.arr[i];
        }
        for(int i = 0; i < l.size; i++) {
            flag = true;
            for(int j = 0; j < this.size; j++) {
                if(l.arr[i] == this.arr[j]) {
                     flag = false;
                     a.size--;
                     break;
                }
            }
            if(flag) a.arr[k++] = l.arr[i];
        }
        return a;
    }
    
    List unCommon(List l1, List l2) {
        List a = new List(l1.size + l2.size);
        int k = 0;
        boolean flag = false;
        for(int i = 0; i < l1.size; i++) {
            flag = true;
            for(int j = 0; j < l2.size; j++) {
                if(l1.arr[i] == l2.arr[j]) {
                     flag = false;
                     a.size--;
                     break;
                }
            }
            if(flag) a.arr[k++] = l1.arr[i];
        }
        for(int i = 0; i < l1.size; i++) {
            flag = true;
            for(int j = 0; j < l2.size; j++) {
                if(l2.arr[i] == l1.arr[j]) {
                     flag = false;
                     a.size--;
                     break;
                }
            }
            if(flag) a.arr[k++] = l2.arr[i];
        }
        return a;
    }
    
    void unCommon1(List l) {
        int[] a =new int[this.size + l.size];
        this.size = this.size + l.size;
        int k = 0;
        boolean flag = false;
        for(int i = 0; i < this.size; i++) {
            flag = true;
            for(int j = 0; j < l.size; j++) {
                if(this.arr[i] == l.arr[j]) {
                     flag = false;
                     this.size--;
                     break;
                }
            }
            if(flag) a[k++] = this.arr[i];
        }
        for(int i = 0; i < l.size; i++) {
            flag = true;
            for(int j = 0; j < this.size; j++) {
                if(l.arr[i] == this.arr[j]) {
                     flag = false;
                     this.size--;
                     break;
                }
            }
            if(flag) a[k++] = l.arr[i];
        }
        this.arr = a;
    }
    
    void unCommon2(List l1, List l2) {
        int[] a =new int[l1.size + l2.size];
        this.size = l1.size + l2.size;
        int k = 0;
        boolean flag = false;
        for(int i = 0; i < l1.size; i++) {
            flag = true;
            for(int j = 0; j < l2.size; j++) {
                if(l1.arr[i] == l2.arr[j]) {
                     flag = false;
                     this.size--;
                     break;
                }
            }
            if(flag) a[k++] = l1.arr[i];
        }
        for(int i = 0; i < l2.size; i++) {
            flag = true;
            for(int j = 0; j < l1.size; j++) {
                if(l2.arr[i] == l1.arr[j]) {
                     flag = false;
                     this.size--;
                     break;
                }
            }
            if(flag) a[k++] = l2.arr[i];
        }
        this.arr = a;
    }
    
    void input() {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < this.size; i++) 
        {
            
           
            System.out.print(" Integer @ " + i + " -> ");
            this.arr[i] = sc.nextInt();
        }
    }
    
    void display() {
        System.out.print(" || Uncommon elements -> ");
        for(int i = 0; i < size; i++) {
            System.out.print(this.arr[i]+" | ");
        }
    }


    public static void main()
    {
        Scanner vg = new Scanner(System.in);

        System.out.println("\t\t || Welcome to ListObjects || \t @VaasuG");
        System.out.println("\t MENU :");
        System.out.println(" 1. List unCommon(List L1)");
        System.out.println(" 2. List unCommon(List L1, List L1) ");
        System.out.println(" 3. void unCommon(List L1)");
        System.out.println(" 4. void unCommon(List L1, List L2)");
        System.out.print("\n | Enter choice -> ");
        int ch=vg.nextInt();
        List A,B,C;
        if (ch == 1)
        {
            System.out.print("\n | Enter size for A -> ");
            A = new List (vg.nextInt());
            A.input();
            System.out.print("\n | Enter size for B -> ");
            B = new List (vg.nextInt());
            
            B.input();
            C = A.unCommon(B);
            C.display();
        }
        else if (ch == 2)
        {
            System.out.print("\n | Enter size for A -> ");
            A = new List (vg.nextInt());
            
            A.input();
            System.out.print("\n | Enter size for A -> ");
            B = new List (vg.nextInt());
            
            B.input();
            C = A.unCommon(A,B);
            C.display();
        }
        else if (ch == 3)
        {
            System.out.print("\n | Enter size for A -> ");
            A = new List (vg.nextInt());
            
            A.input();
            System.out.print("\n | Enter size for A -> ");
            B = new List (vg.nextInt());
            
            B.input();
            A.unCommon1(B);
        }
        else if (ch == 4)
        {
            System.out.print("\n | Enter size for A -> ");
            A = new List (vg.nextInt());
            
            A.input();
            System.out.print("\n | Enter size for A -> ");
            B = new List (vg.nextInt());
            
            B.input();
            A.unCommon2(A,B);
            A.display();

        }
        else
            System.out.println("!Invalid Input!");
        System.out.println("\t || Thank You ||");

    }
}

        