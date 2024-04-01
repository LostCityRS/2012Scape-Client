package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajg")
public class ClientScript extends class800 {

	int id;

	@ObfuscatedName("ajg.t")
	public ClientTriggerType trigger;

	@ObfuscatedName("ajg.l")
	public String scriptName;

	@ObfuscatedName("ajg.f")
	public ClientScriptCommand[] instructions;

	@ObfuscatedName("ajg.d")
	public int[] intOperands;

	@ObfuscatedName("ajg.z")
	public Object[] objectOperands;

	@ObfuscatedName("ajg.n")
	public long[] longOperands;

	@ObfuscatedName("ajg.o")
	public int intLocalCount;

	@ObfuscatedName("ajg.q")
	public int objectLocalCount;

	@ObfuscatedName("ajg.p")
	public int longLocalCount;

	@ObfuscatedName("ajg.w")
	public int intArgCount;

	@ObfuscatedName("ajg.b")
	public int objectArgCount;

	@ObfuscatedName("ajg.x")
	public int longArgCount;

	@ObfuscatedName("ajg.i")
	public IterableMap[] switchTables;

	public ClientScript(Packet buf) {
		int size = this.decodeScript(buf);

		int instr = 0;
		ClientScriptCommand[] commands = ClientScriptCommand.values();
		while (buf.pos < size) {
			ClientScriptCommand command = this.decodeCommand(buf, commands);
			this.decodeOperands(buf, instr, command);

			instr++;
		}
	}

	@ObfuscatedName("ajg.u(Laet;[Lsd;I)Lsd;")
	public ClientScriptCommand decodeCommand(Packet buf, ClientScriptCommand[] commands) {
		int id = buf.g2();

//		if (id < 0 || id >= commands.length) {
//			throw new RuntimeException("bad command (" + id + ")");
//		}
//		return commands[id];

		return ClientScriptCommand.BY_ID[id];
	}

	@ObfuscatedName("ajg.j(Laet;S)I")
	public int decodeScript(Packet buf) {
		buf.pos = buf.data.length - 2;
		int trailerLen = buf.g2();
		int trailerPos = buf.data.length - 2 - trailerLen - 16;

		buf.pos = trailerPos;
		int instructions = buf.g4s();
		this.intLocalCount = buf.g2();
		this.objectLocalCount = buf.g2();
		this.longLocalCount = buf.g2();
		this.intArgCount = buf.g2();
		this.objectArgCount = buf.g2();
		this.longArgCount = buf.g2();

		int switches = buf.g1();
		if (switches > 0) {
			this.switchTables = new IterableMap[switches];
			for (int i = 0; i < switches; i++) {
				int count = buf.g2();

				IterableMap var8 = new IterableMap(IntMath.bitceil(count));
				this.switchTables[i] = var8;
				while (count-- > 0) {
					int key = buf.g4s();
					int offset = buf.g4s();
					var8.pushNode(new IntNode(offset), (long) key);
				}
			}
		}

		buf.pos = 0;
		this.scriptName = buf.fastgstr();
		this.instructions = new ClientScriptCommand[instructions];
		return trailerPos;
	}

	@ObfuscatedName("ajg.a(Laet;ILsd;I)V")
	public void decodeOperands(Packet buf, int instr, ClientScriptCommand command) {
		int length = this.instructions.length;

		if (ClientScriptCommand.PUSH_CONSTANT_STRING == command) {
			if (this.objectOperands == null) {
				this.objectOperands = new String[length];
			}

			this.objectOperands[instr] = buf.gjstr().intern();
		} else if (ClientScriptCommand.PUSH_CONSTANT_LONG == command) {
			if (this.longOperands == null) {
				this.longOperands = new long[length];
			}

			this.longOperands[instr] = buf.g8();
		} else {
			if (this.intOperands == null) {
				this.intOperands = new int[length];
			}

			if (command.isLargeOperand) {
				this.intOperands[instr] = buf.g4s();
			} else {
				this.intOperands[instr] = buf.g1();
			}
		}

		this.instructions[instr] = command;
	}
}
