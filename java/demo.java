class demo{
int data;
public static void main(String args[]){

demo d1;
d1=new demo();
d1.data+=10;
demo d2;
d2=new demo();
d2.data+=20;
System.out.println("Before swap the value first object:"+d1.data);
System.out.println("Before swap the value second object:"+d2.data);
swap(d1,d2);
}
static void swap(demo x,demo y){
int temp=x.data;
x.data=y.data;
y.data=temp;
}
}


