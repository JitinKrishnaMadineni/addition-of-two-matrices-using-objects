import java.util.*;
class Matrix
{
 int r,c;
 int x[][];
 Scanner sc=null;
 Matrix(int r,int c)
 {
  this.r=r;
  this.c=c;
  x=new int[r][c];
  sc=new Scanner (System.in);
 }
 void read()
 {
 for(int i=0;i<r;i++)
 {
  for(int j=0;j<c;j++)
  {
   x[i][j]=sc.nextInt();
  }
 }
}
Matrix add(Matrix M1,Matrix M2)
{
 Matrix M3=new Matrix(M1.r,M1.c);
 for(int i=0;i<M1.r;i++)
 {
  for(int j=0;j<M1.c;j++)
  {
    M3.x[i][j]=M1.x[i][j]+M2.x[i][j];
  }
 }
 return M3;
}
void display()
{
 for(int i=0;i<r;i++)
 {
  for(int j=0;j<c;j++)
  {
    System.out.print(x[i][j]+"\t");
  }
   System.out.print("\n");
 }
}
}
class Matadd
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter size of a matrix");
  int x=s.nextInt();
  int y=s.nextInt();
  Matrix M1=new Matrix(x,y);
  Matrix M2=new Matrix(x,y);
  Matrix M3=new Matrix(x,y);
  System.out.println("enter elements of first matrix");
  M1.read();
  System.out.println("enter elements of second matrix");
  M2.read();
  M3=M1.add(M1,M2);
  M1.display();
  M2.display();
  System.out.println("result is");
  M3.display();
 }
}