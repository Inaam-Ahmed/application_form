import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class form 
{
	static String catagory="",dated="",rno="",name="",dob="",sex="",cnic="",fname="",paddress="",domicile="",city="",pcode="",phon="",email="",mj1="",mj2="",mj3="",program="",faculty="",code="",cname="",challan_no="",challan_date="";	
	static double tmarks,omarks,percentage,matric_obtained_marks,matric_total_marks,inter_obtained_marks,inter_total_marks,bs_obtained_marks,bs_total_marks,amount;
	static double ms_obtained_marks,ms_total_marks,mphil_obtained_marks,mphil_total_marks,qirat_obtained_marks,qirat_total_marks;
	static String p1,p2,p3,p4,p5,p6;
	public static void main(String[] args)throws Exception 
	{
		form();	
		System.out.print("Do you want to apply now?[1/0]");
			fill();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYour Form Is ");
		form();
			System.out.println("Good Buy");
	}
	
static void fill() throws Exception
{
name=JOptionPane.showInputDialog("Enter Your Name : ");

String filename=name+"1.txt";
PrintWriter savefile=new PrintWriter(new FileWriter(filename));
savefile.println("Name"+name);
catagory=JOptionPane.showInputDialog("Enter Catagory : ");
savefile.println("Catagory: "+catagory);
dated=JOptionPane.showInputDialog("Enter Date : ");
savefile.println("Date "+dated);
rno=JOptionPane.showInputDialog("Entry Test Roll Number : ");
savefile.println("Entery Test Roll Number: "+rno);
dob=JOptionPane.showInputDialog("Enter Date of Birth: ");
savefile.println("Date of Birth : "+dob);
sex=JOptionPane.showInputDialog("Enter Sex [F/M] : ");
savefile.println("Sex : "+sex);
cnic=JOptionPane.showInputDialog("Enter CNIC : ");
savefile.println("CNIC"+cnic);
fname=JOptionPane.showInputDialog("Enter Father Name : ");
savefile.println("Father Name : "+fname);
paddress=JOptionPane.showInputDialog("Enter Postal Address : ");
savefile.println("Postal Address "+paddress);
domicile=JOptionPane.showInputDialog("Domicile : ");
savefile.println("Domicile"+domicile);
city=JOptionPane.showInputDialog("City: ");
savefile.println("City " +city);
pcode=JOptionPane.showInputDialog("Enter Postal Code : ");
savefile.println("Postal Code : "+pcode);
phon=JOptionPane.showInputDialog("Enter Phon# : ");
savefile.println("Phon # :"+phon);
email=JOptionPane.showInputDialog("Enter Email : ");
savefile.println("Email : "+email);
tmarks=Integer.parseInt(JOptionPane.showInputDialog("Total entry test marks : "));
savefile.println("Entry test total marks : "+tmarks);
omarks=Integer.parseInt(JOptionPane.showInputDialog("Obtained entry test marks : "));
savefile.println("Entry test obtained marks : "+omarks);
percentage=Integer.parseInt(JOptionPane.showInputDialog("percentage : "));
savefile.println("Percentage "+ percentage);
matric_total_marks=Integer.parseInt(JOptionPane.showInputDialog("Enter matric total marks : "));
savefile.println("Matric Total Marks : "+matric_total_marks);
matric_obtained_marks=Integer.parseInt(JOptionPane.showInputDialog("Enter matric obtained marks: "));
savefile.println("matric_obtained_marks "+matric_obtained_marks);
inter_total_marks=Integer.parseInt(JOptionPane.showInputDialog("Enter FA/FSc Total marks: "));
savefile.println("inter_total_marks"+inter_total_marks);
inter_obtained_marks=Integer.parseInt(JOptionPane.showInputDialog("Enter FA/FSc Obtained marks"));
savefile.println("inter_obtained_marks"+inter_obtained_marks);
bs_total_marks=Integer.parseInt(JOptionPane.showInputDialog("BA/BSe Total marks"));
savefile.println("bs_total_marks"+bs_total_marks);
bs_obtained_marks=Integer.parseInt(JOptionPane.showInputDialog("BA/BSc obtained marks: "));
savefile.println("bs_obtained_marks"+bs_obtained_marks);
ms_total_marks=Integer.parseInt(JOptionPane.showInputDialog("MA/MSc,Masters Total marks : "));
savefile.println("ms_total_marks"+ms_total_marks);
ms_obtained_marks=Integer.parseInt(JOptionPane.showInputDialog("MA/MSc,Masters Total marks : "));
savefile.println("ms_obtained_marks"+ms_obtained_marks);
mphil_total_marks=Integer.parseInt(JOptionPane.showInputDialog("Mphil Total marks :  "));
savefile.println("mphil_total_marks"+mphil_total_marks);
mphil_obtained_marks=Integer.parseInt(JOptionPane.showInputDialog("Mphil obtained marks :  "));
savefile.println("mphil_obtained_marks"+mphil_obtained_marks);
qirat_total_marks=Integer.parseInt(JOptionPane.showInputDialog("Qirat Total marks :  "));
savefile.println("qirat_total_marks"+qirat_total_marks);
qirat_obtained_marks=Integer.parseInt(JOptionPane.showInputDialog("Qirat Obtained marks :  : "));
savefile.println("qirat_obtained_marks"+qirat_obtained_marks);
mj1=JOptionPane.showInputDialog("Enter Major Subject 1 : ");
savefile.println("Major Subject 1 : "+mj1);
mj2=JOptionPane.showInputDialog("Enter Major Subject 2 : ");
savefile.println("Major Subject 2 : "+mj2);
mj3=JOptionPane.showInputDialog("Enter Major Subject 3 : ");
savefile.println("Major Subject 3 : "+mj3);

program=JOptionPane.showInputDialog("Enter Program : ");
savefile.println("program"+program);
faculty=JOptionPane.showInputDialog("Faculty : ");
savefile.println("faculty"+faculty);
code=JOptionPane.showInputDialog("Enter Course Code : ");
savefile.println("code"+code);
cname=JOptionPane.showInputDialog("Enter Course Name : ");
savefile.println("Course Name " +cname);
challan_no=JOptionPane.showInputDialog("Enter CChallan Number : ");
savefile.println("challan_no  "+challan_no);
challan_date=JOptionPane.showInputDialog("Enter Challan Date : ");
savefile.println("challan_date"+challan_date);
amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount : "));
savefile.println("Amount"+amount);
p1=JOptionPane.showInputDialog("Preference 1 : ");
savefile.println("Preference 1 : "+p1);
p2=JOptionPane.showInputDialog("Preference 2 : ");
savefile.println("Preference 2 : "+p2);
p3=JOptionPane.showInputDialog("Preference 3 : ");
savefile.println("Preference 3 : "+p3);
p4=JOptionPane.showInputDialog("Preference 4 : ");
savefile.println("Preference 4 : "+p4);
p5=JOptionPane.showInputDialog("Preference 5 : ");
savefile.println("Preference 5 : "+p5);
p6=JOptionPane.showInputDialog("Preference 6 : ");
savefile.println("Preference 6 : "+p6);
savefile.close();
}
static void form()
{
System.out.println("\t\t\t\t\t\tMirpur University Of Science & Technology");
System.out.println("\t\t\t\t\t\t\t\tAzad Kashmir");
System.out.println("\t\t\t\t\t\t\t\tAdmission Form(2014)");

System.out.println("Category:[ " +catagory+" ]");
System.out.println("Subsidized, Regular, Sports, Disable, Overseas, DAE, Teacher Son/Daughter etc.(To choose Category, consult Seat Allocation Table given in the Prospectus)");
System.out.println("Important! ");
System.out.println("Candidates desirous to apply on more than one Category shall be required to apply on separate application form for each category with all required documents.");
System.out.println("Candidates desirous to apply in more than one Faculty shall be required to apply on separate application form for each faculty with all required documents.");

System.out.println("\n\n\nFOR OFFICE USE ONLY: Date of receipt of application:");
System.out.println("DD/M M/YY [ " + dated + "]");
System.out.println("\n\nDecision of admission Committee ");
System.out.println("[Accepted] [Accepted Provisionally] [Rejected]");
System.out.println("\n\nTo be filled by Candidate: Entry Test Roll No [ " + rno + " ] ");
System.out.println("Entry Test Total Marks ["+tmarks+"]"+ " Entry Test Obtained Marks[ "+omarks+ "]"+ "Percentage[ "+ percentage+ "]");
System.out.println("\n\n\nApplicant Name ["+name+"]");
System.out.println("Date of Birth [ "+dob+"]");
System.out.println("Sex ["+sex+"]");
System.out.println("CNIC No.["+cnic+"]");
System.out.println("Father’s Name ["+fname+"]");
System.out.println("Postal Address (in Block Letters):["+paddress+"]");
System.out.println("Domicile: [ "+domicile+"]");
System.out.println("City:["+city+"]");
System.out.println("Postal Code: ["+pcode+"]");
System.out.println("Telephone No [ "+phon+"]");
System.out.println("E-mail:["+email+"]");
System.out.println("\n\n\t\t\t\tAcademic Record:------------------------");
System.out.println("Matric [" + matric_obtained_marks+ "][" +matric_total_marks+"]");
System.out.println("F.A/F.Sc/DAE[" + inter_obtained_marks+ "][" +inter_total_marks+"]");
System.out.println("B.A/B.SC./B.Com[" + bs_obtained_marks+ "][" +bs_total_marks+"]");
System.out.println("M.A/M.Sc[" + ms_obtained_marks+ "][" +ms_total_marks+"]");
System.out.println("M.Phil[" + mphil_obtained_marks+ "][" +mphil_total_marks+"]");
System.out.println("Other Qirrat/ Hifz[" + qirat_obtained_marks+ "][" +qirat_total_marks+"]");
System.out.println("Major Subjects Studied in last Certificate/Degree"+"]");
System.out.println("Major Subjects Studied in last Certificate/Degree ["+mj1+"-"+mj2+"-"+mj3+"]");

System.out.println("\n\nProgram (in which admission is required): \nUndergraduate Graduate or Graduate ["+program+"]");

System.out.println("\nCode \t\tFaculty of Arts");
System.out.println("A-01\t\tBA, LLB\nA-02\t\tBBA (4 Years)\nA-03\t\tBFA\nA-04\t\tBankding & Finance (4 Years)\nA-05\t\tB.Ed. (1 Year)\nA-06\t\tEducation and Administrational (Hons)\nA-07\t\tBS (Hons) Home Economics\nA-08\t\tFine Arts\nA-09\t\tEconomics\nA-10\t\tIslamic Studies\nA-11\t\tEducation Administration\nA-12\t\tM.Ed (1 Year)\nA-13\t\tMBA (i-3.5 Years ii-1.5 Years)\nA-14\t\tMBA (Executive)\nA-15\t\tEnglish");
System.out.println("\n\nCode\t\tFaculty of Engineering & Technology Engineering\nE-01\t\tCivil\nE-02\t\tComputer Systems\nE-03\t\tElectrical\nE-04\t\tMechanical\nE-05\t\tSoftware\nE-06\t\tPower\n\n\nCode\t\tTechnology\nT-01\t\tCivil\nT-02\t\tElectrical\nT-03\t\tElectronics\nT-04\t\tMechanical");
System.out.println("\n\nCode\t\tFaculty of Science\nS-01\t\tBS (CS)\nS-02\t\tBS (IT)\nS-03\t\tBS (Math)\nS-04\t\tBiotechnology\nS-05\t\tBotany\nS-06\t\tChemistry\nS-07\t\tComputer Science\nS-08\t\tMathematics\nS-09\t\tPhysics\nS-10\t\tStatistics\nS-11\t\tZoology");
System.out.println("\n\nSelected Program ["+program+"] Faculty ["+faculty+"] Code [ "+code+"] Course Name ["+cname+"]");
System.out.println("\n\n\nFee Deposited vide challan No. [ "+challan_no+"]\t\t\t Challan Dated ["+challan_date+"]\t\t\tAmount["+amount+"]\t\t\t");
System.out.println("Preference of Department (Please write preference code of department/discipline only from the list given above");

System.out.println("\n\n\nPreference\t\t Department/Discipline Code\n1st\t["+p1+"]\n2nd\t["+p2+"]\n3rd\t["+p3+"]\n4th\t["+p4+"]\n5th\t["+p5+"]\n6th\t["+p6+"]");
System.out.println("Note:•	\nCandidates desirous to opt. for more than one department (Civil, Mechanical, Electrical…………); shall be required to mention their order of preference in the space provided on the same application form. ");
}
}
