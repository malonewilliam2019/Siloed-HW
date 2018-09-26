public class Main {

    public static void main(String[] args) {
        float h1=72.0f,r1=11.0f;
        float h2=19.0f,r2=9.0f;
        float h3=50.0f,r3=6.5f;
        float h4=67.0f,r4=8.0f;
        float h5=16.0f,r5=7.0f;
        float h6=53.0f,r6=11.5f;
        float h7=69.0f,r7=11.0f;
        float h8=30.0f,r8=11.0f;
        float h9=52.0f,r9=11.5f;
        float h10=40.0f,r10=8.0f;
        float h11=31.0f,r11=9.0f;
        float h12=75.0f,r12=11.5f;
        float pi=3.14f;

        float towVol1=pi*(r1)*(r1)*h1;
        float towVol2=pi*(r2)*(r2)*h2;
        float towVol3=pi*(r3)*(r3)*h3;
        float towVol4=pi*(r4)*(r4)*h4;
        float towVol5=pi*(r5)*(r5)*h5;
        float towVol6=pi*(r6)*(r6)*h6;
        float towVol7=pi*(r7)*(r7)*h7;
        float towVol8=pi*(r8)*(r8)*h8;
        float towVol9=pi*(r9)*(r9)*h9;
        float towVol10=pi*(r10)*(r10)*h10;
        float towVol11=pi*(r11)*(r11)*h11;
        float towVol12=pi*(r12)*(r12)*h12;

        float totvol=towVol1+towVol2+towVol3+towVol4+towVol5+towVol6+towVol7+towVol8+towVol9+towVol10+towVol11+towVol12;

        float pop=37640.0f;
        float avgwat=.246f;
        float days=28.0f;

        float nomvol=pop*avgwat*days;

        float vol=nomvol-totvol;

        float sav=vol/(days*pop);

        System.out.println("the average savings per person per day is");
        System.out.printf("%.3f %10s",sav,"Cubic Meters");
    }
}
