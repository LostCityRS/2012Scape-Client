
import deob.ObfuscatedName;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("akt")
public final class GameCanvas extends Canvas {

	@ObfuscatedName("akt.u")
	public Component field10522;

	public GameCanvas(Component arg0) {
		this.field10522 = arg0;
	}

	public final void update(Graphics arg0) {
		this.field10522.update(arg0);
	}

	public final void paint(Graphics arg0) {
		this.field10522.paint(arg0);
	}
}