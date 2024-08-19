import org.aeonbits.owner.Config;

public interface FruitsConfig extends Config {

  @Key("array")
  String[] getFruitsArray();


  @Key("list")
  String[] getFruitsList();

}
