import java.awt.List;
import org.aeonbits.owner.Config;
import org.checkerframework.common.value.qual.EnsuresMinLenIf;

public interface FruitsConfig extends Config {

  @Key("array")
  String[] getFruitsArray();

  @Key("array")
  @DefaultValue("orange,apple")
  String[] getFruitsArrayWihtDefaultValues();

  @Key("list")
  String[] getFruitsList();

  @Key("array")
  @Separator(";")
  @DefaultValue("orange;banana")
  String[] getFruitsArrayWihtSeparator();


}
