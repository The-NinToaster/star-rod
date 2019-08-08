This is the last remaining fork of gredguy's Star Rod decomp. 




# Star Rod

Clover created the original tool. I'm attempting to reverse engineer is. It's used asm hacking, map editing, and dumping games assets.

set breakpoint at 0x0010F292 (current HP) at the first data point in the memory viewer
[05] 0A

if you hit an hp block the breakpoint hits! then you're brought into the Commands window where you can reverse engineer the asm function. click step in the command window to walk through the code squence.

command addresses for hp update, each non indedented addresses is a step in the call stack

800EA328
    SB	V1, 0x0002 (A1) // V1 00000000 0000000A A1 FFFFFFFF 8010F290
800FA32C
    JR	RA // RA is FFFFFFFF 802E5000
802E5000
    JAL	0x800EA264 //
800EA264
    LUI	A1, 0x8011 // A1 FFFFFFFF 8010F290
800EA268
    ADDIU A1, A1, 0xF290 // A1 FFFFFFFF 80110000
800EA26C
    LB	V1, 0x0005 (A1) // V1 00000000 0000000A A1 FFFFFFFF 8010F290
800EA270
    ADDIU V0, R0, 0xFFFE // V0 00000000 0000000A R0 00000000 00000000
800EA274
    BNE	A0, V0, 0x800EA298 // A0 FFFFFFFF FFFFFFFE and A0 FFFFFFFF FFFFFFFF from CPU GPR (general purpose registers)
800EA298
    BGTZL A0, 0x800EA2A0 // A0 is FFFFFFFF FFFFFFFF
800EA2A0
    ADDIU	V0, R0, 0xFFFF // V0 FFFFFFFF FFFFFFFE and R0 00000000 00000000
800EA2A4
    BEQ	A0, V0, 0x800EA2BC // A0 FFFFFFFF FFFFFFFF and V0 FFFFFFFF FFFFFFFF
800EA2BC
    LB	V1, 0x0006 (A1) // V1 00000000 00000004 and A1 FFFFFFFF 8010F290
800EA2C0
    SB	V1, 0x0005 (A1) // V1 00000000 00000005 and A1 FFFFFFFF 8010F290
800EA2C4
    JR	RA // RA FFFFFFFF 802E5008
802E5008
    JAL	0x80149CB4 // RA is FFFFFFFF 802E5008
80149CB4
    ADDIU	SP, SP, -0x18 // SP is FFFFFFFF 800AE5D0
80149CB8
    DADDU	A1, R0, R0 // A1 FFFFFFFF 8010F290 R0 00000000 00000000 R0 00000000 00000000
80149CBC
    DADDU	A2, A1, R0 // A2 00000000 00000009 A1 00000000 00000000 R0 00000000 00000000
80149CC0
    SW	RA, 0x0010 (SP) // RA FFFFFFFF 802E5010 SP FFFFFFFF 800AE5B8
80149CC4
    JAL	0x80149AB8
80149AB8
    LUI	V0, 0x8007 // V0 00000000 00000005
80149ABC
    LW	V0, 0x419C (V0) // V0 FFFFFFFF 80070000
80149AC0
    ADDIU	SP, SP, -0x18 // SP FFFFFFFF 800AE5B8
80149AC4
    SW	RA, 0x0010 (SP) // RA FFFFFFFF 80149CCC SP FFFFFFFF 800AE5A0
80149AC8
    LB	V0, 0x0071 (V0) // V0 FFFFFFFF 80074024
80149ACC
    BNEZ	V0, 0x80149BD8 // V0 00000000 00000000
80149AD0
    DADDU	T1, A3, R0 // T1 00000000 00000271 A3 00000000 00000000 R0 00000000 00000000
80149AD4
    BGEZL	A0, 0x80149BC8 // A0 00000000 00000131
80149BC8
    ANDI	A2, A2, 0x00FF // A2 00000000 00000000
80149BCC
    SLL	A3, T1, 16 // A3 00000000 00000000 T1 00000000 00000000
80149BD0
    JAL	0x80055240
80055240
    ADDIU	SP, SP, -0x20 // SP FFFFFFFF 800AE5A0
80055244
    DADDU	T3, A0, R0 // T3 00000000 00000000 A0 00000000 00000131 R0 00000000 0000000
80055248
    DADDU	T2, A2, R0 // T2 00000000 00000000 A2 00000000 00000000  R0 00000000 00000000
8005524C
    DADDU	T0, A3, R0 // T0 00000000 3F800000 A3 00000000 00000000 R0 00000000 00000000
80055250
    DADDU	A3, T0, R0 // A3 00000000 00000000 T0 00000000 00000000 R0 00000000 00000000
80055254
    ANDI	A1, A1, 0x00FF // A1 00000000 00000000
80055258
    SLL	V1, A1, 8 // V1 00000000 00000005 A1 00000000 00000000
8005525C
    LUI	A0, 0x800A // A0 00000000 00000131
80055260
    LW	A0, 0xA640 (A0) // A0 FFFFFFFF 800A0000
80055264
    DADDU	T1, V1, R0 // T1 00000000 00000000 V1 00000000 00000000 R0 00000000 00000000
80055268
    BEQZ	A1, 0x80055274 // A1 00000000 00000000
80055274
    SLL	V0, A2, 24 // V0 00000000 00000000 A2 00000000 00000000
80055278
    BLTZL	V0, 0x80055280 // V0 00000000 00000000
80055280
    SLL	V0, T0, 16 // V0 00000000 00000000 T0 00000000 00000000
80055284
    SRA	V1, V0, 16 // V1 00000000 00000000 V0 00000000 00000000 16
80055288
    SLTI	V0, V1, 0x0961 // V0 00000000 00000000 V1 00000000 00000000
8005528C
    BNEZ	V0, 0x8005529C // V0 00000000 00000001
8005529C
    BNEZL	V0, 0x800552A4 // V0 00000000 00000000
800552A4
    ANDI	V0, T2, 0x00FF // V0 00000000 00000000 T2 00000000 00000000
800552A8
    SLL	A2, T1, 16 // A2 00000000 00000000 T1 00000000 00000000
resumed and pasued rom again... everything crashes....



# Refs
- [Used to decompile Clover's source jar](http://www.javadecompilers.com/)
- [Paper Mario dialog system](http://wiki.origami64.net/paper_mario/dialog_system)
- [Paper Mario hacking tools](http://wiki.origami64.net/paper_mario/hacking_tools)
- [Paper Mario map layouts](http://www.mariouniverse.com/maps-n64-pm/)
- [Paper Mario shrine](http://shrines.rpgclassics.com/n64/papermario/index.shtml)
- [Star Rod Map Editor Video Walkthrough](https://www.youtube.com/watch?v=Ppbo57Y4SME)
- [Star Rod Scripting START HERE FOR ASM HACKING](https://heyitsmeuralex.gitbooks.io/star-rod/scripting-basics.html)
- [Star Rod Reddit](https://www.reddit.com/r/StarRod)

# ASM
- Guide from [Origami 64](http://origami64.net/showthread.php?tid=845)
    - Part 1: Introduction to MIPS ASM - https://docs.google.com/presentation/d/1HjVlIPqFUtFN6cXGp5yh9HDhbrrs0nJW47Xaiyi-weA
    - Part 2: Registers - https://docs.google.com/presentation/d/1vPSHG8I2mNw7gQXcmCCGjKQOffFaFY1PLVBTt-ASJiw
    - Part 3: Common Commands - https://docs.google.com/presentation/d/1WkDbXtnaGTjFI570GW74YjK-uSkezAofXlMwxMic__I
    - Part 4: Jumps and Branches - https://docs.google.com/presentation/d/1b9HhwRZWQItpZRGnE62h4AKgAy82yMOb1h9Dk7j7lks
    - Part 4.5: Behaviour Scripts - https://docs.google.com/presentation/d/17oYiwFwYVBl1ATQR_zWBKMGNHPpC_RUtGuevZfWqT7g
    - Part 5: Custom Objects - https://docs.google.com/document/d/1vLZ2liazKyjT90I1Y_R8amUVy9OEKccTvkVpnpGSBjw/edit?usp=sharing
