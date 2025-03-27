import java.util.Date;


public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
    public Block( String data, String previousHash ){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = caltulateHash();
    }
    public String caltulateHash(){
        String calculatedHash = StringUtil.applySHA256(previousHash+Long.toString(timeStamp)+data);
        return calculatedHash;
    }
}
