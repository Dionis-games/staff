/* (c) Copyright 2020 and following years, Yann-Gaël Guéhéneuc,
 * Concordia University.
 * 
 * Use and copying of this software and preparation of derivative works
 * based upon this software are permitted. Any copy of this software or
 * of any derivative work must include the above copyright notice of
 * the author, this paragraph and the one after it.
 * 
 * This software is made available AS IS, and THE AUTHOR DISCLAIMS
 * ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE, AND NOT WITHSTANDING ANY OTHER PROVISION CONTAINED HEREIN,
 * ANY LIABILITY FOR DAMAGES RESULTING FROM THE SOFTWARE OR ITS USE IS
 * EXPRESSLY DISCLAIMED, WHETHER ARISING IN CONTRACT, TORT (INCLUDING
 * NEGLIGENCE) OR STRICT LIABILITY, EVEN IF THE AUTHOR IS ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 * 
 * All Rights Reserved.
 */
package ca.concordia.soen6461.characterclasses.impl;

import ca.concordia.soen6461.characterclasses.IRanger;

public class BarbarianCharacter implements IRanger {

	@Override
	public String getStrength() {
		return "Barbarian: Get Strength Ability of the Character";
	}

	@Override
	public String getDexterity() {
		return "Barbarian: Get Dexterity Ability of the Character";
	}

	@Override
	public String getConstitution() {
		return "Barbarian: Get Constitution Ability of the Character";
	}

	@Override
	public String getIntelligence() {
		return "Barbarian: Get Intelligence Ability of the Character";
	}

	@Override
	public String getWisdom() {
		return "Barbarian: Get Wisdom Ability of the Character";
	}

	@Override
	public String getCharisma() {
		return "Barbarian: Get Charisma Ability of the Character";
	}

	@Override
	public String getClothings() {
		return "Barbarian: Get Clothings Ability of the Character";
	}

	
}
