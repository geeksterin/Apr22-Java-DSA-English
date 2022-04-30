public class Main {
    public static void main(String[] args) {
        // Two Versions (- With Stars, - With Numbers)
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // Pattern 1: Upper-Left Triangle
        for(int row=n; row>=1; row--){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern 2: Upper-Right Triangle
        for(int row=n; row>=1; row--){
            // First Inner Loop will be of Dashes
            for(int dash=1; dash<=n-row; dash++){
                System.out.print(' ');
            }
            
            // Second Inner Loop will be of Stars
            for(int star=1; star<=row; star++){
                System.out.print('*');
            }
            
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern 3: Lower-Right Triangle
        for(int row=1; row<=n; row++){
            // First Inner Loop will be of Dashes
            for(int dash=1; dash<=n-row; dash++){
                System.out.print(' ');
            }
            
            // Second Inner Loop will be of Stars
            for(int star=1; star<=row; star++){
                System.out.print('*');
            }
            
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern 4: Lower-Left Triangle
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Pyramid Pattern
        for(int row=1; row<=n; row++){
            // Dashes or Spaces
            for(int dash=1; dash<=n-row; dash++){
                System.out.print(' ');
            }
            
            // Stars
            for(int star=1; star<=2*row-1; star++){
                System.out.print('*');
            }
            
            System.out.println();
        }
        
        System.out.println();
        //Diamond Problem
        
        // 1. Pyramid for Rows as N/2 + 1
        int np = n/2 + 1;
        for(int row=1; row<=np; row++){
            // Dashes or Spaces
            for(int dash=1; dash<=np-row; dash++){
                System.out.print(' ');
            }
            
            // Stars
            for(int star=1; star<=2*row-1; star++){
                System.out.print('*');
            }
            
            System.out.println();
        }
        
        
        // 2. Inverse Pyramid for Rows as N/2
        int ni = n/2;
        
        for(int row=1; row<=ni; row++){
            // Dash
            for(int dash=1; dash<=row; dash++){
                System.out.print(' ');
            }
            
            for(int star=1; star<= 2*(ni - row) + 1; star++){
                System.out.print('*');
            }
            System.out.println();
        }
        
        
    }
}
