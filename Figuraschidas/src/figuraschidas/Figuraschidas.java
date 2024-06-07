

package figuraschidas;

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author Kevin

 */
public class Figuraschidas extends Applet{

int X[] = {322,306,302,278,283,255,270,241,264,237,265,243,272,259,286,281,304,
				309,324,337,343,365,360,387,372,403,380,408,380,402,373,389,361,365,343,337};
	int Y[] = {472,444,474,455,484,474,500,500,518,528,538,556,556,579,571,598,580,
				607,584,607,580,597,570,580,556,556,536,529,519,502,502,476,485,456,475,447};
	int p=36;
	int a[] = {254,247,302,312};
	int b[] = {356,430,474,408};
	int c[] = {270,234,160,202};
	int d[] = {500,441,438,500};
	int e[] = {265,200,146,215};
	int f[] = {538,517,556,578};
	int r[] = {286,224,213,276};
	int o[] = {571,591,653,630};
	int v[] = {324,291,325,354};
	int j[] = {584,635,689,636};
	int u[] = {360,371,433,422};
	int y[] = {570,630,653,592};
	int x[] = {380,429,496,443};
	int t[] = {536,579,559,519};
	int q[] = {373,441,481,408};
	int w[] = {502,502,442,442};
	int F[] = {343,396,386,329};
	int k[] = {475,432,358,407};
	int l[] = {320,297,253,249,198,214,159,190,141,184,146,197,170,220,213,260,266,300,324,348,383,388,
			433,426,476,449,497,457,500,452,481,428,441,392,386,344};
	int L[] = {346,395,356,412,389,440,438,484,497,526,557,573,611,608,653,636,680,649,688,649,680,636,
				653,609,612,573,559,528,500,485,442,443,393,414,358,396};
	int V[] = {319,280,254,251,176,192,158,178,112,170,146,177,146,217,213,241,257,310,324,339,391,406,
				434,428,497,468,497,473,529,464,480,449,462,390,385,360};
	int A[] = {314,379,356,391,364,439,438,465,491,539,556,567,624,627,653,643,703,666,689,666,703,643,
				653,626,625,568,559,540,495,468,442,442,369,390,358,380};
	int Z[] = {318,249,123,146,37,132,90,205,237,325,413,442,554,510,600,494,514,391};
	int S[] = {223,342,304,432,478,559,655,662,758,701,758,663,656,562,484,435,310,344};
	int M[] = {217,213,236,248};
	int Rec[] = {261,301,311,289};
	int yi[] = {73,96,118,111};
	int er[] = {390,422,415,392};
	int Vic[] = {59,93,104,84};
	int Hug[] = {570,581,564,550};
	int ret[] = {161,193,188,165};
	int rup[] = {712,701,681,682};
	int tuc[] = {325,340,325,309};
	int rw[] = {763,738,726,738};
	int poor[] = {485,481,457,456};
	int jack[] = {711,683,679,702};
	int Man[] = {583,557,538,554};
	int ind[] = {574,553,566,585};
	int rfg[] = {563,527,520,542};
	int saf[] = {396,397,420,427};
	int ig[] = {420,390,402,425};
	int or[] = {264,292,314,304};
	public void paint(Graphics g){
		g.setColor(Color.orange);
		g.fillOval(0,190,630,622);
		g.setColor(Color.darkGray);
		g.fillOval(30,222,570,555);
		g.setColor(Color.magenta);
		g.fillPolygon(M,Rec,4);
		g.fillPolygon(yi,er,4);
		g.fillPolygon(Vic,Hug,4);
		g.fillPolygon(ret,rup,4);
		g.fillPolygon(tuc,rw,4);
		g.fillPolygon(poor,jack,4);
		g.fillPolygon(Man,ind,4);
		g.fillPolygon(rfg,saf,4);
		g.fillPolygon(ig,or,4);
		g.setColor(Color.gray);
		g.fillPolygon(Z,S,18);
		g.setColor(Color.black);
		g.fillPolygon(V,A,36);
		g.setColor(Color.lightGray);
		g.fillPolygon(l,L,36);
		g.setColor(Color.red);
		g.fillPolygon(a,b,4);
		g.fillPolygon(c,d,4);
		g.fillPolygon(e,f,4);
		g.fillPolygon(r,o,4);
		g.fillPolygon(v,j,4);
		g.fillPolygon(u,y,4);
		g.fillPolygon(x,t,4);
		g.fillPolygon(q,w,4);
		g.fillPolygon(F,k,4);
		g.setColor(Color.cyan);
		g.fillPolygon(X,Y,p);
		g.setColor(Color.black);
	}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
