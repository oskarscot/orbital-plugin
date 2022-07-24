import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import me.oskarscot.orbital.OrbitalPlugin;
import org.bukkit.entity.Player;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrbitalPluginTest {

  private static ServerMock server;

  @BeforeAll
  public static void load(){
    server = MockBukkit.mock();
    MockBukkit.load(OrbitalPlugin.class);
  }

  @AfterAll
  public static void unload(){
    MockBukkit.unmock();
  }

  @Test
  @DisplayName("Test if player would be set on fire")
  void testFireCommand(){
    Player target = server.addPlayer();

    server.execute("fire", target, target.getName()).assertSucceeded();
  }

  @Test
  @DisplayName("Test if player would be struck by lightning")
  void testLightningCommand(){
    Player target = server.addPlayer();

    server.execute("lightning", target, target.getName()).assertSucceeded();
  }

  @Test
  @DisplayName("Test if player would explode")
  void testExplodeCommand(){
    Player target = server.addPlayer();

    server.execute("explode", target, target.getName()).assertSucceeded();
  }

}
