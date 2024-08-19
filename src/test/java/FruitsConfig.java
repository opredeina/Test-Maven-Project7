import org.aeonbits.owner.Config;

public interface FruitsConfig extends Config {

  @Key("array")
  String[] getFruitsArray();

  @Key("array")
  @DefaultValue("orange,apple")
  String[] getFruitsArrayWihtDefaultValues();

  @Key("list")
  String[] getFruitsList();

  @Key("list")
  @Separator(";")
  @DefaultValue("orange;banana")
  String[] getFruitsListWihtSeparator();


}
