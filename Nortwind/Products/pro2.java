import java.io.*;
import java.lang.*;
class pro2 {
public static void main (String args[]) throws IOException {
int i = 1;
String b;
double tpay=0;
double pay=0;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_products.dat");
BufferedReader bin = new BufferedReader (fin);
FileOutputStream fout = new FileOutputStream("pro.htm");
BufferedOutputStream bout = new BufferedOutputStream(fout);
PrintStream pout = new PrintStream(bout);
pout.println("<center><body bgcolor=white><table border=1 width=80%>");
pout.println("<tr bgcolor=#D0ECE7 align=center><td>No</td><td>productid</td><td>productname</td><td>supplierid</td><td>categoryid</td></tr>");
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);
if(i % 2 == 0)
pout.println("<tr bgcolor=#F9E79F>");
else
pout.println("<tr bgcolor=#FFA07A>");

pout.println("<td align=center>"+i+"</td>");
pout.println("<td align=center>"+ fields[0]+"</td>");
pout.println("<td align=left>"+fields[1]+"</td>");
pout.println("<td align=right>"+ fields[2]+"</td>");
pout.println("<td align=right>"+fields[3]+"</td>");
//pout.println("<td align=right>"+ Integer.parseInt(fields[4]) * Integer.parseInt(fields[5])+"</td>");

//pay = Integer.parseInt(fields[4]) * Integer.parseInt(fields[5]);
//tpay = tpay + pay;

//pout.println("</tr>");
i = i + 1;
}

//pout.println("<tr><td colspan=5 align=center>Total Pay</td><td align=right>"+tpay +"</td></tr>");

pout.println("</table></body>");
fin.close();
pout.close();
}
}
