
public class TennisGameImpl implements TennisGame {
    
    private int r1 = 0;
    private int s2 = 0;
    private String p1n;
    private String b2n;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.p1n = player1Name;
        this.b2n = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            r1 += 1;
        else
            s2 += 1;
    }

    public String getScore() {
        String scr = "";
        int tmpScrInt=0;
        if (r1==s2)
        {
            switch (r1)
            {
                case 0:
                        scr = "Love-All";
                    break;
                case 1:
                        scr = "Fifteen-All";
                    break;
                case 2:
                        scr = "Thirty-All";
                    break;
                default:
                        scr = "Deuce";
                    break;
                
            }
        }
        else if (r1>=4 || s2>=4)
        {
            int minusResult = r1-s2;
            if (minusResult==1) scr ="Advantage player1";
            else if (minusResult ==-1) scr ="Advantage player2";
            else if (minusResult>=2) scr = "Win for player1";
            else scr ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tmpScrInt = r1;
                else { scr+="-"; tmpScrInt = s2;}
                switch(tmpScrInt)
                {
                    case 0:
                        scr+="Love";
                        break;
                    case 1:
                        scr+="Fifteen";
                        break;
                    case 2:
                        scr+="Thirty";
                        break;
                    case 3:
                        scr+="Forty";
                        break;
                }
            }
        }
        return scr;
    }
}
