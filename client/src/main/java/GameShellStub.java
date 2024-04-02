
import deob.ObfuscatedName;
import java.applet.Applet;
import java.awt.Graphics;

@ObfuscatedName("nu")
public interface GameShellStub {

	void init();

	void start();

	void supplyApplet(Applet arg0);

	void destroy();

	void update(Graphics arg0);

	void paint(Graphics arg0);

	void stop();
}
