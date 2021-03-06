/*
 * JOOSJ is Copyright (C) 2000 Othman Alaoui
 *
 * Reproduction of all or part of this software is permitted for
 * educational or research use on condition that this copyright notice is
 * included in any copy. This software comes with no warranty of any
 * kind. In no event will the author be liable for any damages resulting from
 * use of this software.
 *
 * email: oalaou@po-box.mcgill.ca
 */


package joosc.code.bytecode;

public abstract class LocalInstr implements Instr {
	private int offset;
	public LocalInstr(int offset) { this.offset = offset; }
	public int getOffset() { return offset; }
	protected abstract String getName();
	public String toString() {
		return getName()+
		       ((offset >= 0 && offset <= 3) ? "_" : " ")+
		       offset;
	}
}
