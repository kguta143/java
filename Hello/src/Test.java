

//public class Hello {
//
//	public static void main(String[] args) {
//	
//		 {
//
//		      int i = 0, j = 0, k = 0;
//
//		      OUTER : for( i=0; i < 10 ; i++ )
//
//		           MIDDLE : for ( j=0; j < 3; j++ )
//
//		               INNER : for ( k=0; k < 4; k++ ) {
//
//		                    if( i==4 && j ==2 ) break OUTER;
//
//		               }
//
//		           System.out.println( i );
//
//		System.out.println( j );
//
//		System.out.println(k );
//	
//		 }
//
//	}
//	
//}
class Parent {

int  i = 7;

public int get() {  return i ; }

}

class Child extends Parent {

int  i = 5 ;

public int get() {  return i ; }

}

public class Test {

public static void main ( String [] args ) {

   Parent  p = new Parent ();

   System.out.println("---------------------1---------------------");

   System.out.println( p.i );

   System.out.println( p.get( ) );

Child  c = new Child ();

   System.out.println("---------------------2---------------------");

   System.out.println( c.i );

   System.out.println( c.get( ) );

   Parent  p2 = new Child ();

   System.out.println("---------------------3---------------------");

   System.out.println( p2.i );

   System.out.println( p2.get( ) );

}

}
