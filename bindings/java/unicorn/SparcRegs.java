/*

Java bindings for the Unicorn Emulator Engine

Copyright(c) 2015 Chris Eagle

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
version 2 as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

*/

package unicorn;

public interface SparcRegs {
   public static final int UC_SPARC_REG_INVALID = 0;
   public static final int UC_SPARC_REG_F0 = 1;
   public static final int UC_SPARC_REG_F1 = 2;
   public static final int UC_SPARC_REG_F2 = 3;
   public static final int UC_SPARC_REG_F3 = 4;
   public static final int UC_SPARC_REG_F4 = 5;
   public static final int UC_SPARC_REG_F5 = 6;
   public static final int UC_SPARC_REG_F6 = 7;
   public static final int UC_SPARC_REG_F7 = 8;
   public static final int UC_SPARC_REG_F8 = 9;
   public static final int UC_SPARC_REG_F9 = 10;
   public static final int UC_SPARC_REG_F10 = 11;
   public static final int UC_SPARC_REG_F11 = 12;
   public static final int UC_SPARC_REG_F12 = 13;
   public static final int UC_SPARC_REG_F13 = 14;
   public static final int UC_SPARC_REG_F14 = 15;
   public static final int UC_SPARC_REG_F15 = 16;
   public static final int UC_SPARC_REG_F16 = 17;
   public static final int UC_SPARC_REG_F17 = 18;
   public static final int UC_SPARC_REG_F18 = 19;
   public static final int UC_SPARC_REG_F19 = 20;
   public static final int UC_SPARC_REG_F20 = 21;
   public static final int UC_SPARC_REG_F21 = 22;
   public static final int UC_SPARC_REG_F22 = 23;
   public static final int UC_SPARC_REG_F23 = 24;
   public static final int UC_SPARC_REG_F24 = 25;
   public static final int UC_SPARC_REG_F25 = 26;
   public static final int UC_SPARC_REG_F26 = 27;
   public static final int UC_SPARC_REG_F27 = 28;
   public static final int UC_SPARC_REG_F28 = 29;
   public static final int UC_SPARC_REG_F29 = 30;
   public static final int UC_SPARC_REG_F30 = 31;
   public static final int UC_SPARC_REG_F31 = 32;
   public static final int UC_SPARC_REG_F32 = 33;
   public static final int UC_SPARC_REG_F34 = 34;
   public static final int UC_SPARC_REG_F36 = 35;
   public static final int UC_SPARC_REG_F38 = 36;
   public static final int UC_SPARC_REG_F40 = 37;
   public static final int UC_SPARC_REG_F42 = 38;
   public static final int UC_SPARC_REG_F44 = 39;
   public static final int UC_SPARC_REG_F46 = 40;
   public static final int UC_SPARC_REG_F48 = 41;
   public static final int UC_SPARC_REG_F50 = 42;
   public static final int UC_SPARC_REG_F52 = 43;
   public static final int UC_SPARC_REG_F54 = 44;
   public static final int UC_SPARC_REG_F56 = 45;
   public static final int UC_SPARC_REG_F58 = 46;
   public static final int UC_SPARC_REG_F60 = 47;
   public static final int UC_SPARC_REG_F62 = 48;
   public static final int UC_SPARC_REG_FCC0 = 49;
   public static final int UC_SPARC_REG_FCC1 = 50;
   public static final int UC_SPARC_REG_FCC2 = 51;
   public static final int UC_SPARC_REG_FCC3 = 52;
   public static final int UC_SPARC_REG_FP = 53;
   public static final int UC_SPARC_REG_G0 = 54;
   public static final int UC_SPARC_REG_G1 = 55;
   public static final int UC_SPARC_REG_G2 = 56;
   public static final int UC_SPARC_REG_G3 = 57;
   public static final int UC_SPARC_REG_G4 = 58;
   public static final int UC_SPARC_REG_G5 = 59;
   public static final int UC_SPARC_REG_G6 = 60;
   public static final int UC_SPARC_REG_G7 = 61;
   public static final int UC_SPARC_REG_I0 = 62;
   public static final int UC_SPARC_REG_I1 = 63;
   public static final int UC_SPARC_REG_I2 = 64;
   public static final int UC_SPARC_REG_I3 = 65;
   public static final int UC_SPARC_REG_I4 = 66;
   public static final int UC_SPARC_REG_I5 = 67;
   public static final int UC_SPARC_REG_I7 = 68;
   public static final int UC_SPARC_REG_ICC = 69;
   public static final int UC_SPARC_REG_L0 = 70;
   public static final int UC_SPARC_REG_L1 = 71;
   public static final int UC_SPARC_REG_L2 = 72;
   public static final int UC_SPARC_REG_L3 = 73;
   public static final int UC_SPARC_REG_L4 = 74;
   public static final int UC_SPARC_REG_L5 = 75;
   public static final int UC_SPARC_REG_L6 = 76;
   public static final int UC_SPARC_REG_L7 = 77;
   public static final int UC_SPARC_REG_O0 = 78;
   public static final int UC_SPARC_REG_O1 = 79;
   public static final int UC_SPARC_REG_O2 = 80;
   public static final int UC_SPARC_REG_O3 = 81;
   public static final int UC_SPARC_REG_O4 = 82;
   public static final int UC_SPARC_REG_O5 = 83;
   public static final int UC_SPARC_REG_O7 = 84;
   public static final int UC_SPARC_REG_SP = 85;
   public static final int UC_SPARC_REG_Y = 86;
   public static final int UC_SPARC_REG_XCC = 87;
   public static final int UC_SPARC_REG_PC = 88;
   public static final int UC_SPARC_REG_ENDING = 89;
   public static final int UC_SPARC_REG_O6 = UC_SPARC_REG_SP;
   public static final int UC_SPARC_REG_I6 = UC_SPARC_REG_FP;
}