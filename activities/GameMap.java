/**********************************************************
* Program	:  Legend of Metroid
* Author	:  Scott Reader
* Due Date	:  Friday January 18th
* Description	:  ISU
***********************************************************/

package activities;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class GameMap extends JPanel implements ActionListener, KeyListener{
	
	//Fields
	
	ImageIcon mapPart1 = new ImageIcon(getClass().getResource("/img/corner1.png"));
	ImageIcon mapPart2 = new ImageIcon(getClass().getResource("/img/corner2.png"));
	ImageIcon mapPart3 = new ImageIcon(getClass().getResource("/img/corner3.png"));
	ImageIcon mapPart4 = new ImageIcon(getClass().getResource("/img/corner4.png"));
	ImageIcon mapPart5 = new ImageIcon(getClass().getResource("/img/greenMountain.png"));
	ImageIcon mapPart6 = new ImageIcon(getClass().getResource("/img/greenMountainTop.png"));
	ImageIcon mapPart7 = new ImageIcon(getClass().getResource("/img/item box.jpg"));
	ImageIcon mapPart8 = new ImageIcon(getClass().getResource("/img/bush.png"));
	ImageIcon mapPart9 = new ImageIcon(getClass().getResource("/img/health bar head.png"));
	ImageIcon mapPart10 = new ImageIcon(getClass().getResource("/img/water 1.png"));
	ImageIcon mapPart11 = new ImageIcon(getClass().getResource("/img/water 2.png"));
	ImageIcon mapPart12 = new ImageIcon(getClass().getResource("/img/water 3.png"));
	ImageIcon mapPart13 = new ImageIcon(getClass().getResource("/img/water 4.png"));
	ImageIcon mapPart14 = new ImageIcon(getClass().getResource("/img/water 5.png"));
	ImageIcon mapPart15 = new ImageIcon(getClass().getResource("/img/water 6.png"));
	ImageIcon mapPart16 = new ImageIcon(getClass().getResource("/img/stairs.png"));
	ImageIcon mapPart17 = new ImageIcon(getClass().getResource("/img/statue.png"));
	ImageIcon mapPart18 = new ImageIcon(getClass().getResource("/img/end 1.png"));
	ImageIcon mapPart19 = new ImageIcon(getClass().getResource("/img/end 2.png"));
	ImageIcon mapPart20 = new ImageIcon(getClass().getResource("/img/end 3.png"));
	ImageIcon mapPart21 = new ImageIcon(getClass().getResource("/img/end 4.png"));
	ImageIcon mapPart22 = new ImageIcon(getClass().getResource("/img/end 5.png"));
	ImageIcon mapPart23 = new ImageIcon(getClass().getResource("/img/itemCaveWall.png"));
	ImageIcon mapPart24 = new ImageIcon(getClass().getResource("/img/itemCaveWall2.png"));
	ImageIcon mapPart25 = new ImageIcon(getClass().getResource("/img/Octorock Down Animation.gif"));
	ImageIcon mapPart26 = new ImageIcon(getClass().getResource("/img/Octorock Left Animation.gif"));
	ImageIcon mapPart27 = new ImageIcon(getClass().getResource("/img/Octorock Right Animation.gif"));
	ImageIcon mapPart28 = new ImageIcon(getClass().getResource("/img/Octorock Up Animation.gif"));
	ImageIcon mapPart29 = new ImageIcon(getClass().getResource("/img/blasterBlast.png"));
	ImageIcon mapPart30 = new ImageIcon(getClass().getResource("/img/Samus Up Animation Attempt.gif"));
	ImageIcon mapPart31 = new ImageIcon(getClass().getResource("/img/Samus Down Animation Attempt.gif"));
	ImageIcon mapPart32 = new ImageIcon(getClass().getResource("/img/Samus Left Animation Attempt.gif"));
	ImageIcon mapPart33 = new ImageIcon(getClass().getResource("/img/Samus Right Animation Attempt.gif"));
	ImageIcon mapPart34 = new ImageIcon(getClass().getResource("/img/Samus Up Idle.png"));
	ImageIcon mapPart35 = new ImageIcon(getClass().getResource("/img/Samus Down Idle.png"));
	ImageIcon mapPart36 = new ImageIcon(getClass().getResource("/img/Samus Left Idle.png"));
	ImageIcon mapPart37 = new ImageIcon(getClass().getResource("/img/Samus Right Idle.png"));
	ImageIcon mapPart38 = new ImageIcon(getClass().getResource("/img/HealthFull.png"));
	ImageIcon mapPart39 = new ImageIcon(getClass().getResource("/img/HealthEmpty.png"));
	ImageIcon mapPart40 = new ImageIcon(getClass().getResource("/img/missile.jpg"));
	ImageIcon mapPart41 = new ImageIcon(getClass().getResource("/img/blaster.png"));
	ImageIcon mapPart42 = new ImageIcon(getClass().getResource("/img/energy tank.png"));
	ImageIcon mapPart43 = new ImageIcon(getClass().getResource("/img/missile expansion.png"));
	ImageIcon mapPart44 = new ImageIcon(getClass().getResource("/img/fire sprite.gif"));
	ImageIcon mapPart45 = new ImageIcon(getClass().getResource("/img/game over copy.png"));
	ImageIcon mapPart46 = new ImageIcon(getClass().getResource("/img/missileProjectileUp.png"));
	ImageIcon mapPart47 = new ImageIcon(getClass().getResource("/img/missileProjectileDown.png"));
	ImageIcon mapPart48 = new ImageIcon(getClass().getResource("/img/missileProjectileLeft.png"));
	ImageIcon mapPart49 = new ImageIcon(getClass().getResource("/img/missileProjectileRight.png"));
	ImageIcon mapPart50 = new ImageIcon(getClass().getResource("/img/triangle pointer.png"));
	ImageIcon mapPart51 = new ImageIcon(getClass().getResource("/img/Game over pointer.png"));
	ImageIcon mapPart52 = new ImageIcon(getClass().getResource("/img/Moblin Down Animation.gif"));
	ImageIcon mapPart53 = new ImageIcon(getClass().getResource("/img/Moblin Left Animation.gif"));
	ImageIcon mapPart54 = new ImageIcon(getClass().getResource("/img/metroid boss room block 3.png"));
	ImageIcon mapPart55 = new ImageIcon(getClass().getResource("/img/metroid boss room block 4.png"));
	ImageIcon mapPart56 = new ImageIcon(getClass().getResource("/img/metroid boss room block 5.png"));
	ImageIcon mapPart57 = new ImageIcon(getClass().getResource("/img/metroid boss room block 6.png"));
	ImageIcon mapPart58 = new ImageIcon(getClass().getResource("/img/Moblin Right Animation.gif"));
	ImageIcon mapPart59 = new ImageIcon(getClass().getResource("/img/metroid boss room block 8.png"));
	ImageIcon mapPart60 = new ImageIcon(getClass().getResource("/img/metroid boss room block 9.png"));
	ImageIcon mapPart61 = new ImageIcon(getClass().getResource("/img/metroid boss room block 10.png"));
	ImageIcon mapPart62 = new ImageIcon(getClass().getResource("/img/metroid boss room block 11.png"));
	ImageIcon mapPart63 = new ImageIcon(getClass().getResource("/img/metroid boss room block 12.png"));
	ImageIcon mapPart64 = new ImageIcon(getClass().getResource("/img/Moblin Up Animation.gif"));
	ImageIcon mapPart65 = new ImageIcon(getClass().getResource("/img/metroid boss room block 14.png"));
	ImageIcon mapPart66 = new ImageIcon(getClass().getResource("/img/metroid boss room block 15.png"));
	ImageIcon mapPart67 = new ImageIcon(getClass().getResource("/img/metroid boss room block 16.png"));
	ImageIcon mapPart68 = new ImageIcon(getClass().getResource("/img/rinka.png"));
	ImageIcon mapPart69 = new ImageIcon(getClass().getResource("/img/mother brain glass close.png"));
	ImageIcon mapPart70 = new ImageIcon(getClass().getResource("/img/mother brain glass open.png"));
	ImageIcon mapPart71 = new ImageIcon(getClass().getResource("/img/mother brain platform base.png"));
	ImageIcon mapPart72 = new ImageIcon(getClass().getResource("/img/Heavy Octorock Down Animation.gif"));
	ImageIcon mapPart73 = new ImageIcon(getClass().getResource("/img/Heavy Octorock Left Animation.gif"));
	ImageIcon mapPart74 = new ImageIcon(getClass().getResource("/img/Heavy Octorock Right Animation.gif"));
	ImageIcon mapPart75 = new ImageIcon(getClass().getResource("/img/Heavy Octorock Up Animation.gif"));
	ImageIcon mapPart76 = new ImageIcon(getClass().getResource("/img/Heavy Moblin Down Animation.gif"));
	ImageIcon mapPart77 = new ImageIcon(getClass().getResource("/img/Heavy Moblin Left Animation.gif"));
	ImageIcon mapPart78 = new ImageIcon(getClass().getResource("/img/Heavy Moblin Right Animation.gif"));
	ImageIcon mapPart79 = new ImageIcon(getClass().getResource("/img/Heavy Moblin Up Animation.gif"));
	ImageIcon mapPart80 = new ImageIcon(getClass().getResource("/img/metroid health.png"));
	ImageIcon mapPart81 = new ImageIcon(getClass().getResource("/img/EnemyRock.png"));
	ImageIcon mapPart82 = new ImageIcon(getClass().getResource("/img/Legend of Metroid Title Screen.png"));
	ImageIcon mapPart83 = new ImageIcon(getClass().getResource("/img/Samus Left Jump.png"));
	ImageIcon mapPart84 = new ImageIcon(getClass().getResource("/img/Samus Right Jump.png"));
	ImageIcon mapPart85 = new ImageIcon(getClass().getResource("/img/ZoraPew.png"));
	ImageIcon mapPart86 = new ImageIcon(getClass().getResource("/img/zora.png"));
	ImageIcon mapPart87 = new ImageIcon(getClass().getResource("/img/Legend of Metroid Victory Screen.png"));

	int SpecialPewTimer = 0;
	int targetPx = 0;
	int targetPy = 0;
	int temppoint = 0;
	boolean glassBreak = false;
	boolean titlescreen = true;
	boolean winScreen = false;
	boolean isInAir = false;
	boolean bossInvinc = false;
	int bossInvincTimer = 0;
	int bossHealth = 40;
	boolean bossInvis = false;
	int jumpHeight = 0;
	static int mapcount = 0;
	int tempMapCount = 0;
	int blastNum = 0;
	int blastcount = 0;
	int charx = 640;
	int chary = 480;
	int VelX = 0;
	int VelY = 0;
	int temp = 1;
	int keyPressL = 1;
	int keyPressR = 1;
	int keyPressU = 1;
	int keyPressD = 1;
	int cheating = 0;
	int playerLook = 6;
	int blastVelX = 0;
	int blastVelY = 5;
	int blastWallX = 0;
	int blastWallY = 0;
	int[] healthBarSize = new int [3];
	int PlayerHP = 3;
	int PlayerDamage = 0;
	int[] PlayerDamageSize = new int [0];
	int HPBarX = 110;
	int tempHPBarX = 0;
	int WeaponToggle = 0;
	boolean blasterCollect = false;
	boolean missileCollect = false;
	boolean eTank1 = false;
	boolean eTank2 = false;
	boolean eTank3 = false;
	boolean eTank4 = false;
	boolean eTank5 = false;
	boolean eTank6 = false;
	boolean eTank7 = false;
	boolean missleExpansion1 = false;
	boolean missleExpansion2 = false;
	boolean missleExpansion3 = false;
	boolean playerInvinc = false;
	boolean playerInvis = false;
	int playerInvincTimer = 0;
	int pointerY = 570;
	int missileCapacity = 0;
	int maxMissile = 0;
	int AI1Health = 0;
	int AI1Look = 1;
	int tempAI1Put = 0;
	int AIVelX1 = 0;
	int AIVelY1 = 0;
	int AIx1 = 0;
	int AIy1 = 128;
	int AIdirection1 = 0;
	int AI1Type = 1;
	boolean AI1Invinc = false;
	int AI1InvincTimer = 0;
	boolean AI1Invis = false;
	int AI1PewVelx = 0;
	int AI1PewVely = 0;
	int AI1PewNum = 0;
	int AI1PewCount = 0;
	int AI1ItemDropPut = 0;
	int AI1ItemDrop = 0;
	int ItemDrop1 = 0;
	boolean ItemDropCollect1 = false;
	int AI2Health = 0;
	int AI2Look = 1;
	int tempAI2Put = 0;
	int AIVelX2 = 0;
	int AIVelY2 = 0;
	int AIx2 = 0;
	int AIy2 = 128;
	int AIdirection2 = 0;
	int AI2Type = 1;
	boolean AI2Invinc = false;
	int AI2InvincTimer = 0;
	boolean AI2Invis = false;
	int AI2PewVelx = 0;
	int AI2PewVely = 0;
	int AI2PewNum = 0;
	int AI2PewCount = 0;
	int AI2ItemDropPut = 0;
	int AI2ItemDrop = 0;
	int ItemDrop2 = 0;
	boolean ItemDropCollect2 = false;
	int AI3Health = 0;
	int AI3Look = 1;
	int tempAI3Put = 0;
	int AIVelX3 = 0;
	int AIVelY3 = 0;
	int AIx3 = 0;
	int AIy3 = 128;
	int AIdirection3 = 0;
	int AI3Type = 1;
	boolean AI3Invinc = false;
	int AI3InvincTimer = 0;
	boolean AI3Invis = false;
	int AI3PewVelx = 0;
	int AI3PewVely = 0;
	int AI3PewNum = 0;
	int AI3PewCount = 0;
	int AI3ItemDropPut = 0;
	int AI3ItemDrop = 0;
	int ItemDrop3 = 0;
	boolean ItemDropCollect3 = false;
	int AI4Health = 0;
	int AI4Look = 1;
	int tempAI4Put = 0;
	int AIVelX4 = 0;
	int AIVelY4 = 0;
	int AIx4 = 0;
	int AIy4 = 128;
	int AIdirection4 = 0;
	int AI4Type = 1;
	boolean AI4Invinc = false;
	int AI4InvincTimer = 0;
	boolean AI4Invis = false;
	int AI4PewVelx = 0;
	int AI4PewVely = 0;
	int AI4PewNum = 0;
	int AI4PewCount = 0;
	int AI4ItemDropPut = 0;
	int AI4ItemDrop = 0;
	int ItemDrop4 = 0;
	boolean ItemDropCollect4 = false;
	int AI5x = 0;
	int AI5y = 0;
	boolean AI5Invis = true;
	int AI5Timer = 60;
	int AI5Health = 0;

	
	//Maps
	
	static int[][] map = {  {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,3,1,1,1,1,1,0,0,0,0,0,0,0},
							{0,0,3,1,1,1,1,1,1,0,0,0,0,0,0,0},
							{0,0,1,1,1,1,1,1,1,4,0,0,0,0,0,0},
							{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{0,0,1,1,1,1,1,1,1,1,1,1,1,1,7,7},
							{0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
							{0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
							{0,0,7,7,7,7,7,7,7,7,7,7,7,7,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
	
		int[][] printmap = map;

	static int[][] map2 = { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{0,0,8,1,8,1,8,1,1,8,1,8,1,8,1,8},
							{0,0,8,1,8,1,8,1,1,8,1,8,1,8,1,8},
							{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,8},
							{0,3,1,1,1,1,8,1,1,8,1,8,1,8,1,8},
							{3,1,8,1,8,1,1,1,1,1,1,1,1,1,1,8},
							{1,1,1,1,1,1,8,1,1,8,1,8,1,8,1,8},
							{5,1,8,1,8,1,1,1,1,1,1,1,1,1,1,8},
							{0,5,1,1,1,1,8,1,1,8,1,8,1,8,1,8},
							{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,8},
							{0,0,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{0,0,8,8,8,8,8,8,8,8,8,8,8,8,8,8}};
	
	static int[][] map3 = { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{0,0,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{0,0,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,8},
							{0,0,1,1,8,1,1,1,1,8,1,1,1,8,1,8},
							{0,0,8,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{0,0,1,1,8,1,8,1,1,8,1,8,1,8,1,1},
							{0,0,8,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{0,0,1,1,8,1,1,1,1,8,1,1,1,8,1,8},
							{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,8},
							{0,0,8,1,8,1,8,1,1,8,1,8,1,8,1,8},
							{0,0,8,1,8,1,8,1,1,8,1,8,1,8,1,8},
							{0,0,8,1,8,1,8,1,1,8,1,8,1,8,1,8}};
	
	static int[][] map4 = { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{8,8,8,8,8,8,8,8,8,9,10,10,10,10,10,10},
							{8,8,8,8,8,8,8,8,8,9,10,10,10,10,10,10},
							{8,8,1,1,1,1,1,1,1,9,10,10,10,10,10,10},
							{8,1,1,1,1,8,1,1,1,9,10,10,10,10,10,10},
							{1,1,8,1,1,1,1,1,1,11,12,12,12,12,12,12},
							{1,1,1,1,1,8,1,1,1,1,1,1,1,1,1,1},
							{1,1,8,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{8,1,1,1,1,8,1,1,1,1,1,1,1,1,1,1},
							{8,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8}};

	static int[][] map5 = { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{10,10,10,10,10,10,13,8,8,8,8,8,8,8,8,8},
							{10,10,10,10,10,10,13,8,8,8,8,8,8,8,8,8},
							{10,10,10,10,10,10,13,1,1,1,1,1,1,1,1,1},
							{10,10,10,10,10,10,13,1,1,1,1,1,1,1,1,1},
							{12,12,12,12,12,12,14,1,1,1,1,1,8,1,1,1},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{1,1,1,1,1,1,1,1,1,1,1,1,8,1,1,1},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8}};
	
	static int[][] map6 = { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{8,1,8,1,1,1,8,1,8,1,8,8,1,8,8,8},
							{8,1,8,1,1,1,8,1,8,1,8,8,1,8,8,8},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,8,8,8},
							{1,1,1,1,1,1,1,1,1,1,8,1,1,8,8,8},
							{1,1,8,1,1,1,8,1,8,1,1,1,1,8,8,8},
							{1,1,1,1,1,1,1,1,1,1,8,1,1,8,8,8},
							{1,1,8,1,1,1,8,1,8,1,1,1,1,8,8,8},
							{1,1,1,1,1,1,1,1,1,1,8,1,1,8,8,8},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8}};
	
	static int[][] map7 = { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{8,1,1,1,1,1,1,1,1,1,8,1,1,1,1,8},
							{8,1,8,1,1,1,8,1,8,1,1,1,1,1,1,8},
							{8,1,1,1,1,1,1,1,1,1,8,1,1,1,1,8},
							{8,1,8,1,1,1,8,1,8,1,1,1,1,1,1,8},
							{8,1,1,1,1,1,1,1,1,1,8,1,1,1,1,8},
							{8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8},
							{8,1,8,1,1,1,8,1,8,1,8,8,1,8,8,8},
							{8,1,8,1,1,1,8,1,8,1,8,8,1,8,8,8},
							{8,1,8,1,1,1,8,1,8,1,8,8,1,8,8,8}};
	
	static int[][] map8 = { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,1,1,1,1},
							{8,8,8,8,8,8,8,8,8,8,8,8,1,1,1,1},
							{8,8,8,8,8,8,8,8,8,8,8,8,1,1,1,1},
							{8,8,8,8,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8}};
	
	static int[][] map9 = { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{8,8,8,1,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,1,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,1,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,1,8,8,8,8,8,8,8,8,1,8,8,8},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8},
							{8,8,8,1,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,1,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,1,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8}};
	
	static int[][] map10 = {{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
							{8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8},
							{8,1,1,1,1,1,8,1,1,1,1,8,1,1,1,8},
							{1,1,8,1,8,1,1,1,1,8,1,1,1,8,1,8},
							{1,1,1,1,1,1,8,1,1,1,1,8,1,1,1,8},
							{1,1,8,1,8,1,1,1,1,8,1,1,1,8,1,8},
							{8,1,1,1,1,1,8,1,1,1,1,8,1,1,1,8},
							{8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8},
							{8,8,8,1,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,1,8,8,8,8,8,8,8,8,1,8,8,8},
							{8,8,8,1,8,8,8,8,8,8,8,8,1,8,8,8}};
	
	static int[][] map11 = {{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{0,0,0,0,0,0,0,15,0,0,0,0,0,0,0,0},
							{0,0,3,4,3,4,0,15,0,0,0,3,4,0,0,0},
							{0,0,1,1,1,1,0,15,0,0,0,1,1,0,0,0},
							{0,3,1,1,1,1,0,15,0,0,0,1,1,0,0,0},
							{0,1,1,1,1,1,4,15,0,0,3,1,1,0,0,3},
							{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{0,1,1,1,1,1,1,1,1,1,1,1,1,6,0,5},
							{0,5,1,1,1,1,1,1,1,1,1,1,1,0,0,0},
							{0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0},
							{0,0,5,6,5,6,7,7,7,7,7,5,6,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
	
	static int[][] map12 = {{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	
							{0,0,0,0,0,0,0,0,0,0,0,0,3,4,0,0},
							{0,0,3,1,1,1,1,1,1,1,1,1,1,1,4,0},
							{0,3,1,1,1,1,17,18,19,1,1,1,1,1,1,0},
							{0,1,1,16,1,16,20,25,21,16,1,16,1,1,1,0},
							{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
							{0,1,1,16,1,16,1,1,1,16,1,16,1,1,1,0},
							{0,5,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
							{0,0,5,1,1,1,1,1,1,1,1,1,1,1,6,0},
							{0,0,0,0,0,0,0,15,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,15,0,0,0,0,0,0,0,0}, 
							{0,0,0,0,0,0,0,15,0,0,0,0,0,0,0,0}};
	
	static int[][] map13 = {{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22},
							{22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22},
							{22,22,24,24,24,24,24,24,24,24,24,24,24,24,22,22},
							{22,22,24,24,24,24,24,24,24,24,24,24,24,24,22,22},
							{22,22,24,24,24,24,24,24,24,24,24,24,24,24,22,22},
							{22,22,24,24,24,24,24,24,24,24,24,24,24,24,22,22},
							{22,22,24,24,24,24,24,24,24,24,24,24,24,24,22,22},
							{22,22,24,24,24,24,24,24,24,24,24,24,24,24,22,22},
							{22,22,24,24,24,24,24,24,24,24,24,24,24,24,22,22},
							{22,22,23,23,23,23,23,24,24,23,23,23,23,23,22,22},
							{22,22,22,22,22,22,22,24,24,22,22,22,22,22,22,22},
							{22,22,22,22,22,22,22,24,24,22,22,22,22,22,22,22}};
	
	static int[][] map14 = {{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{33,31,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{24,34,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{24,34,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{24,34,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{24,34,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{24,34,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{24,26,33,33,33,33,33,33,33,33,33,33,33,33,33,0},
							{24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24},
							{24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24},
							{28,28,33,33,33,33,33,33,33,33,33,33,33,33,33,0},
							{28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,0}};
	
	static int[][] map15 = {{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
							{33,33,31,28,32,33,33,33,33,35,33,33,33,33,33,33},
							{24,24,30,30,30,24,24,24,24,34,24,24,24,24,24,24},
							{24,40,28,28,28,28,24,24,24,30,24,24,24,24,24,24},
							{24,28,28,28,28,28,24,24,24,24,24,24,24,24,24,24},
							{24,28,28,28,28,28,24,24,24,24,24,24,24,24,24,24},
							{24,28,28,28,28,28,24,24,24,29,24,24,36,37,38,24},
							{39,28,28,28,28,28,28,24,24,34,24,24,24,24,24,24},
							{28,28,28,28,28,28,28,24,24,34,24,24,24,24,24,24},
							{28,28,28,28,28,28,28,24,24,35,24,24,24,24,24,24},
							{28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28},
							{28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28}};
	
	Projectile[] weaponblast = new Projectile [3];
	EnemyProjectile[] EnemyPew = new EnemyProjectile [1];
	BossPew SpecialPew;
	
	Timer timer = new Timer(3, this);

	
	public GameMap () {
		for (int i = 0; i < weaponblast.length; i++) {
			weaponblast[i] = new Projectile (-50, -50,blastVelX,blastVelY);
		}
		
		for (int i = 0; i < EnemyPew.length; i++) {
			EnemyPew[i] = new EnemyProjectile (-50, -50,AI1PewVelx,AI1PewVely);
		}
		
			SpecialPew = new BossPew (576,128,charx,chary);
		
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer.start();		

	}	
	
	public void keyTyped (KeyEvent e) {

	}
	
	//Direction & attack
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		
	
		if (PlayerHP != PlayerDamage) {
		if (mapcount<13) {
		if (c == KeyEvent.VK_RIGHT) {
			VelX = 2;
			VelY = 0;
			playerLook = 4;
			blastVelX = 5;
			blastVelY = 0;
		}else if (c == KeyEvent.VK_DOWN) {
			VelY = 2;
			VelX = 0;
			playerLook = 2;
			blastVelX = 0;
			blastVelY = 5;
		}else if (c == KeyEvent.VK_UP) {
			VelY = -2;
			VelX = 0;
			playerLook = 1;
			blastVelX = 0;
			blastVelY = -5;
		}else if (c == KeyEvent.VK_LEFT) {
			VelX = -2;
			VelY = 0;
			playerLook = 3;
			blastVelX = -5;
			blastVelY = 0;
		}
		}

		if (mapcount>=13) {
			if (c == KeyEvent.VK_RIGHT) {
				VelX = 2;
				playerLook = 4;
				blastVelX = 5;
				blastVelY = 0;
			}else if (c == KeyEvent.VK_LEFT) {
				VelX = -2;
				playerLook = 3;
				blastVelX = -5;
				blastVelY = 0;	
			}
		}

		if (c == KeyEvent.VK_Z) {
			if (missileCapacity>0&&(WeaponToggle%2==0 || WeaponToggle%2!=0)) {
			WeaponToggle++;
			}
			if (missileCapacity<=0&&WeaponToggle%2!=0) {
				WeaponToggle++;
			}
		}
		if (blasterCollect){
		if (c == KeyEvent.VK_SPACE && blastNum == 0) {
				blastNum=1;
		}
		}
		}

		repaint();
	}

	public void keyReleased(KeyEvent e) {
		int c = e.getKeyCode();
		if (titlescreen == true) {
			if (c == KeyEvent.VK_ENTER) {
				titlescreen=false;
			}
		}
		if (PlayerHP != PlayerDamage) {
		if (mapcount<13) {
		if (c == KeyEvent.VK_RIGHT) {
			VelX = 0;
			playerLook = 8;
		}else if (c == KeyEvent.VK_DOWN) {
			VelY = 0;
			playerLook = 6;
		}else if (c == KeyEvent.VK_UP) {
			VelY = 0;
			playerLook = 5;
		}else if (c == KeyEvent.VK_LEFT) {
			VelX = 0;
			playerLook = 7;
		}
		}
		if (mapcount>=13) {
			if (c == KeyEvent.VK_RIGHT) {
				VelX = 0;
				playerLook = 8;
				blastVelX = 5;
				blastVelY = 0;
			}else if (c == KeyEvent.VK_LEFT) {
				VelX = 0;
				playerLook = 7;
				blastVelX = -5;
				blastVelY = 0;	
			}
			if (isInAir==false) {
			if (c == KeyEvent.VK_UP) {
				isInAir=true;
				if(mapcount==13) {
					jumpHeight=chary-64;
					VelY=-4;
				}
				if (mapcount==14) {
					if (chary==640) {
						jumpHeight=chary-320;
					}else if (chary==384 && ((charx<960 && charx>768) || (charx<640 && charx>512))) {
						jumpHeight=chary-192;
					}else if (chary==448 && (charx<448 && charx>0)) {
						jumpHeight=chary-256;
					}
					
					VelY=-4;
				}

			}
		}
		}
		
		
		if (blasterCollect && WeaponToggle%2==0) {
		if (c == KeyEvent.VK_SPACE) {
			blastNum = 0;
			blastcount++;
			if (blastcount == 3) {
				blastcount=0;
			}
		}
		}
		if (blasterCollect && WeaponToggle%2!=0 && missileCapacity>0) {
		if (c == KeyEvent.VK_SPACE) {
			blastNum = 0;
			blastcount++;
			missileCapacity--;
			if (missileCapacity == -1) {
				missileCapacity++;
			}
			if (blastcount == 3) {
				blastcount=0;
			}
		}
		}
		}
		if (PlayerHP <= PlayerDamage) {
		if (c == KeyEvent.VK_DOWN) {
			pointerY = 690;
		}else if (c == KeyEvent.VK_UP) {
			pointerY = 570;
		}if (c == KeyEvent.VK_ENTER) {
			if(pointerY == 570) {
				SpecialPewTimer=0;
				targetPx = 0;
				targetPy = 0;
				temppoint = 0;
				titlescreen = true;
				winScreen = false;
				isInAir = false;
				bossInvinc = false;
				bossInvincTimer = 0;
				bossHealth = 40;
				bossInvis = false;
				jumpHeight = 0;
				mapcount = 0;
				tempMapCount = 0;
				blastNum = 0;
				blastcount = 0;
				charx = 640;
				chary = 480;
				VelX = 0;
				VelY = 0;
				temp = 1;
				keyPressL = 1;
				keyPressR = 1;
				keyPressU = 1;
				keyPressD = 1;
				cheating = 0;
				playerLook = 6;
				blastVelX = 0;
				blastVelY = 5;
				blastWallX = 0;
				blastWallY = 0;
				healthBarSize = new int [3];
				PlayerHP = 3;
				PlayerDamage = 0;
				PlayerDamageSize = new int [0];
				HPBarX = 110;
				tempHPBarX = 0;
				WeaponToggle = 0;
				blasterCollect = false;
				missileCollect = false;
				eTank1 = false;
				eTank2 = false;
				eTank3 = false;
				eTank4 = false;
				eTank5 = false;
				eTank6 = false;
				eTank7 = false;
				missleExpansion1 = false;
				missleExpansion2 = false;
				missleExpansion3 = false;
				playerInvinc = false;
				playerInvis = false;
				playerInvincTimer = 0;
				pointerY = 570;
				missileCapacity = 0;
				maxMissile = 0;
				AI1Health = 0;
				AI1Look = 1;
				tempAI1Put = 0;
				AIVelX1 = 0;
				AIVelY1 = 0;
				AIx1 = 0;
				AIy1 = 128;
				AIdirection1 = 0;
				AI1Type = 1;
				AI1Invinc = false;
				AI1InvincTimer = 0;
				AI1Invis = false;
				AI1PewVelx = 0;
				AI1PewVely = 0;
				AI1PewNum = 0;
				AI1PewCount = 0;
				AI1ItemDropPut = 0;
				AI1ItemDrop = 0;
				ItemDrop1 = 0;
				ItemDropCollect1 = false;
				AI2Health = 0;
				AI2Look = 1;
				tempAI2Put = 0;
				AIVelX2 = 0;
				AIVelY2 = 0;
				AIx2 = 0;
				AIy2 = 128;
				AIdirection2 = 0;
				AI2Type = 1;
				AI2Invinc = false;
				AI2InvincTimer = 0;
				AI2Invis = false;
				AI2PewVelx = 0;
				AI2PewVely = 0;
				AI2PewNum = 0;
				AI2PewCount = 0;
				AI2ItemDropPut = 0;
				AI2ItemDrop = 0;
				ItemDrop2 = 0;
				ItemDropCollect2 = false;
				AI3Health = 0;
				AI3Look = 1;
				tempAI3Put = 0;
				AIVelX3 = 0;
				AIVelY3 = 0;
				AIx3 = 0;
				AIy3 = 128;
				AIdirection3 = 0;
				AI3Type = 1;
				AI3Invinc = false;
				AI3InvincTimer = 0;
				AI3Invis = false;
				AI3PewVelx = 0;
				AI3PewVely = 0;
				AI3PewNum = 0;
				AI3PewCount = 0;
				AI3ItemDropPut = 0;
				AI3ItemDrop = 0;
				ItemDrop3 = 0;
				ItemDropCollect3 = false;
				AI4Health = 0;
				AI4Look = 1;
				tempAI4Put = 0;
				AIVelX4 = 0;
				AIVelY4 = 0;
				AIx4 = 0;
				AIy4 = 128;
				AIdirection4 = 0;
				AI4Type = 1;
				AI4Invinc = false;
				AI4InvincTimer = 0;
				AI4Invis = false;
				AI4PewVelx = 0;
				AI4PewVely = 0;
				AI4PewNum = 0;
				AI4PewCount = 0;
				AI4ItemDropPut = 0;
				AI4ItemDrop = 0;
				ItemDrop4 = 0;
				ItemDropCollect4 = false;
				AI5x = 0;
				AI5y = 0;
				AI5Invis = true;
				AI5Timer = 60;
				printmap = map;
				map2[9][6] = 8;
				map3[7][1] = 0;
				map4[11][13] = 8;
				map5[3][10] = 8;
				map6[3][11] = 8;
				map7[11][14] = 8;
				map8[10][11] = 8;
				map9[12][3] = 8;
				map10[7][11] = 8;
				map11[11][3] = 6;
				map12[3][4] = 0;
				map15[4][1] = 40;
				
			}else if (pointerY==690) {
				System.exit(0);
			}
		}
		}
		
		if(winScreen==true) {
			if (c == KeyEvent.VK_DOWN) {
				pointerY = 685;
			}else if (c == KeyEvent.VK_UP) {
				pointerY = 590;
			}if (c == KeyEvent.VK_ENTER) {
				if(pointerY == 590) {
					SpecialPewTimer=0;
					targetPx = 0;
					targetPy = 0;
					temppoint = 0;
					titlescreen = true;
					winScreen = false;
					isInAir = false;
					bossInvinc = false;
					bossInvincTimer = 0;
					bossHealth = 40;
					bossInvis = false;
					jumpHeight = 0;
					mapcount = 0;
					tempMapCount = 0;
					blastNum = 0;
					blastcount = 0;
					charx = 640;
					chary = 480;
					VelX = 0;
					VelY = 0;
					temp = 1;
					keyPressL = 1;
					keyPressR = 1;
					keyPressU = 1;
					keyPressD = 1;
					cheating = 0;
					playerLook = 6;
					blastVelX = 0;
					blastVelY = 5;
					blastWallX = 0;
					blastWallY = 0;
					healthBarSize = new int [3];
					PlayerHP = 3;
					PlayerDamage = 0;
					PlayerDamageSize = new int [0];
					HPBarX = 110;
					tempHPBarX = 0;
					WeaponToggle = 0;
					blasterCollect = false;
					missileCollect = false;
					eTank1 = false;
					eTank2 = false;
					eTank3 = false;
					eTank4 = false;
					eTank5 = false;
					eTank6 = false;
					eTank7 = false;
					missleExpansion1 = false;
					missleExpansion2 = false;
					missleExpansion3 = false;
					playerInvinc = false;
					playerInvis = false;
					playerInvincTimer = 0;
					pointerY = 570;
					missileCapacity = 0;
					maxMissile = 0;
					AI1Health = 0;
					AI1Look = 1;
					tempAI1Put = 0;
					AIVelX1 = 0;
					AIVelY1 = 0;
					AIx1 = 0;
					AIy1 = 128;
					AIdirection1 = 0;
					AI1Type = 1;
					AI1Invinc = false;
					AI1InvincTimer = 0;
					AI1Invis = false;
					AI1PewVelx = 0;
					AI1PewVely = 0;
					AI1PewNum = 0;
					AI1PewCount = 0;
					AI1ItemDropPut = 0;
					AI1ItemDrop = 0;
					ItemDrop1 = 0;
					ItemDropCollect1 = false;
					AI2Health = 0;
					AI2Look = 1;
					tempAI2Put = 0;
					AIVelX2 = 0;
					AIVelY2 = 0;
					AIx2 = 0;
					AIy2 = 128;
					AIdirection2 = 0;
					AI2Type = 1;
					AI2Invinc = false;
					AI2InvincTimer = 0;
					AI2Invis = false;
					AI2PewVelx = 0;
					AI2PewVely = 0;
					AI2PewNum = 0;
					AI2PewCount = 0;
					AI2ItemDropPut = 0;
					AI2ItemDrop = 0;
					ItemDrop2 = 0;
					ItemDropCollect2 = false;
					AI3Health = 0;
					AI3Look = 1;
					tempAI3Put = 0;
					AIVelX3 = 0;
					AIVelY3 = 0;
					AIx3 = 0;
					AIy3 = 128;
					AIdirection3 = 0;
					AI3Type = 1;
					AI3Invinc = false;
					AI3InvincTimer = 0;
					AI3Invis = false;
					AI3PewVelx = 0;
					AI3PewVely = 0;
					AI3PewNum = 0;
					AI3PewCount = 0;
					AI3ItemDropPut = 0;
					AI3ItemDrop = 0;
					ItemDrop3 = 0;
					ItemDropCollect3 = false;
					AI4Health = 0;
					AI4Look = 1;
					tempAI4Put = 0;
					AIVelX4 = 0;
					AIVelY4 = 0;
					AIx4 = 0;
					AIy4 = 128;
					AIdirection4 = 0;
					AI4Type = 1;
					AI4Invinc = false;
					AI4InvincTimer = 0;
					AI4Invis = false;
					AI4PewVelx = 0;
					AI4PewVely = 0;
					AI4PewNum = 0;
					AI4PewCount = 0;
					AI4ItemDropPut = 0;
					AI4ItemDrop = 0;
					ItemDrop4 = 0;
					ItemDropCollect4 = false;
					AI5x = 0;
					AI5y = 0;
					AI5Invis = true;
					AI5Timer = 60;
					printmap = map;
					map2[9][6] = 8;
					map3[7][1] = 0;
					map4[11][13] = 8;
					map5[3][10] = 8;
					map6[3][11] = 8;
					map7[11][14] = 8;
					map8[10][11] = 8;
					map9[12][3] = 8;
					map10[7][11] = 8;
					map11[11][3] = 6;
					map12[3][4] = 0;
					map15[4][1] = 40;
					
				}else if (pointerY==685) {
					System.exit(0);
				}
			}
		}
		repaint();
	}
	

	
	//Moving (Kinda important)
	public void actionPerformed (ActionEvent e) {
		charx=charx+VelX;
		chary=chary+VelY;
		
		if (temppoint==2) {
			pointerY = 590;
			temppoint--;
		}
		
		if(mapcount==13) {
			if (chary==640) {
			VelY=0;
			isInAir=false;
			}
		if (isInAir==true) {
		if (chary==jumpHeight) {
			
			VelY=4;
		}
		}
		}
		if (mapcount==14) {
			if (chary==640) {
				VelY=0;
				isInAir=false;
			}
			if (chary==384 && ((charx<960 && charx>748) || (charx<640 && charx>512))) {
				VelY=0;
				isInAir=false;
			}
			if (chary==448 && (charx<448 && charx>0)) {
				VelY=0;
				isInAir=false;
			}
			if (isInAir==true) {
			if (chary==jumpHeight){
				
				VelY=4;
			}
		}
		if (isInAir==false) {
		if (chary==448 && charx>448) {
			isInAir=true;
			VelY=4;
		}else if (chary==384 && (charx<748 && charx>640)){
			isInAir=true;
			VelY=4;
		}else if (chary==384 && charx>960) {
			isInAir=true;
			VelY=4;
		}else if (chary==384 && charx<512) {
			isInAir=true;
			VelY=4;
		}
		}
		}


		if (blasterCollect) {
		if (blastNum==1) {
			if (playerLook == 4 || playerLook == 8) {
				weaponblast[blastcount] = new Projectile (charx+42, chary+15, blastVelX,blastVelY);
			}else if (playerLook == 3 || playerLook == 7) {
				weaponblast[blastcount] = new Projectile (charx-11, chary+15, blastVelX,blastVelY);
			}else if (playerLook == 1 || playerLook == 5) {
				weaponblast[blastcount] = new Projectile (charx+26, chary+12, blastVelX,blastVelY);
			}else if (playerLook == 2 || playerLook == 6) {
				weaponblast[blastcount] = new Projectile (charx+8, chary+38, blastVelX,blastVelY);
			}
			blastNum=2;
		}

		for (int i = 0; i < weaponblast.length; i++) {
			weaponblast[i].shoot();
		}	
		}
		
		if (AI1Health > 0 && mapcount > 0 && mapcount < 12 && AI1Health > 0) {
		if (AI1PewNum==1) {
			if (AI1Look == 1) {
				EnemyPew[AI1PewCount-1] = new EnemyProjectile (AIx1+20, AIy1+64, AI1PewVelx,AI1PewVely);
			}else if (AI1Look == 2) {
				EnemyPew[AI1PewCount-1] = new EnemyProjectile (AIx1+20, AIy1-24, AI1PewVelx,AI1PewVely);
			}else if (AI1Look == 3) {
				EnemyPew[AI1PewCount-1] = new EnemyProjectile (AIx1+64, AIy1+20, AI1PewVelx,AI1PewVely);
			}else if (AI1Look == 4) {
				EnemyPew[AI1PewCount-1] = new EnemyProjectile (AIx1-24, AIy1+20, AI1PewVelx,AI1PewVely);
			}
			AI1PewNum=2;
		}
		
		for (int i = 0; i < EnemyPew.length; i++) {
			EnemyPew[i].EnemyShoot();
		}	
		}
		
		if (AI2Health > 0 && mapcount > 0 && mapcount < 12 && AI2Health > 0) {
			if (AI2PewNum==1) {
				if (AI2Look == 1) {
					EnemyPew[AI2PewCount-1] = new EnemyProjectile (AIx2+20, AIy2+64, AI2PewVelx,AI2PewVely);
				}else if (AI2Look == 2) {
					EnemyPew[AI2PewCount-1] = new EnemyProjectile (AIx2+20, AIy2-24, AI2PewVelx,AI2PewVely);
				}else if (AI2Look == 3) {
					EnemyPew[AI2PewCount-1] = new EnemyProjectile (AIx2+64, AIy2+20, AI2PewVelx,AI2PewVely);
				}else if (AI2Look == 4) {
					EnemyPew[AI2PewCount-1] = new EnemyProjectile (AIx2-24, AIy2+20, AI2PewVelx,AI2PewVely);
				}
				AI2PewNum=2;
			}
			
			for (int i = 0; i < EnemyPew.length; i++) {
				EnemyPew[i].EnemyShoot();
			}	
			}
			
			if (AI3Health > 0 && mapcount > 0 && mapcount < 12 && AI3Health > 0) {
		if (AI3PewNum==1) {
			if (AI3Look == 1) {
				EnemyPew[AI3PewCount-1] = new EnemyProjectile (AIx3+20, AIy3+64, AI3PewVelx,AI3PewVely);
			}else if (AI3Look == 2) {
				EnemyPew[AI3PewCount-1] = new EnemyProjectile (AIx3+20, AIy3-24, AI3PewVelx,AI3PewVely);
			}else if (AI3Look == 3) {
				EnemyPew[AI3PewCount-1] = new EnemyProjectile (AIx3+64, AIy3+20, AI3PewVelx,AI3PewVely);
			}else if (AI3Look == 4) {
				EnemyPew[AI3PewCount-1] = new EnemyProjectile (AIx3-24, AIy3+20, AI3PewVelx,AI3PewVely);
			}
			AI3PewNum=2;
		}
		
		for (int i = 0; i < EnemyPew.length; i++) {
			EnemyPew[i].EnemyShoot();
		}	
		}
		
		if (AI4Health > 0 && mapcount > 0 && mapcount < 12 && AI4Health > 0) {
		if (AI4PewNum==1) {
			if (AI4Look == 1) {
				EnemyPew[AI4PewCount-1] = new EnemyProjectile (AIx4+20, AIy4+64, AI4PewVelx,AI4PewVely);
			}else if (AI4Look == 2) {
				EnemyPew[AI4PewCount-1] = new EnemyProjectile (AIx4+20, AIy4-24, AI4PewVelx,AI4PewVely);
			}else if (AI4Look == 3) {
				EnemyPew[AI4PewCount-1] = new EnemyProjectile (AIx4+64, AIy4+20, AI4PewVelx,AI4PewVely);
			}else if (AI4Look == 4) {
				EnemyPew[AI4PewCount-1] = new EnemyProjectile (AIx4-24, AIy4+20, AI4PewVelx,AI4PewVely);
			}
			AI4PewNum=2;
		}
		
		for (int i = 0; i < EnemyPew.length; i++) {
			EnemyPew[i].EnemyShoot();
		}	
		}
			
		if (SpecialPewTimer==300) {
			targetPx = charx;
			targetPy = chary;
			if (mapcount==3||mapcount==4) {
				Random rand = new Random();
				if (mapcount==3 && AI5Health>0) {
				AI5x = rand.nextInt(7)*64+572;
				AI5y = rand.nextInt(5)*64+128;
				}
				if (mapcount==4 && AI5Health>0) {
				AI5x = rand.nextInt(7)*64;
				AI5y = rand.nextInt(5)*64+128;
				}
				SpecialPew = new BossPew (AI5x+16,AI5y+16,targetPx,targetPy);
			}
			if (mapcount==14&&bossHealth>0) {
				SpecialPew = new BossPew (592,144,targetPx,targetPy);

				SpecialPew = new BossPew (592,656,targetPx,targetPy);
				
			}
			SpecialPewTimer=0;
			AI5Invis = false;
		}
		
		SpecialPew.specialShoot();
		
		SpecialPewTimer++;
		if (AI5Invis==false) {
			AI5Timer--;
		}
		if (AI5Timer==0) {
			AI5Invis=true;
			AI5Timer=60;
		}
			
	if (PlayerHP >= PlayerDamage) {
	if(mapcount > 0 && mapcount < 12 && AI1Health > 0) {
		Random rand = new Random();

			if(AIx1 == 0) {
				AIVelX1 = 2;
				AIVelY1 = 0;
				AI1Look = 3;
			}else if (AIx1 == 960) {
				AIVelX1 = -2;
				AIVelY1 = 0;
				AI1Look = 4;
			}else if(AIy1 == 128) {
				AIVelY1 = 2;
				AIVelX1 = 0;
				AI1Look = 1;
			}else if (AIy1 == 768) {
				AIVelY1 = -2;
				AIVelX1 = 0;
				AI1Look = 2;
			}else if (AIx1 % 64 == 0 && AIy1 % 64 == 0) {
			while (true) {
				AIdirection1 = rand.nextInt(4) + 1;
			if (AIdirection1 == 3 && AIVelX1 != -2 && (printmap[AIy1 / 64][(AIx1 / 64)+1] == 1 || printmap[AIy1 / 64][(AIx1 / 64)+1] == 2)) {
				AIVelX1 = 2;
				AIVelY1 = 0;
				AI1Look = 3;
				break;
			} else if (AIdirection1 == 4 && AIVelX1 != 2 && (printmap[AIy1 / 64][(AIx1 / 64)-1] == 1 || printmap[AIy1 / 64][(AIx1 / 64)-1] == 2)) {
				AIVelX1 = -2;
				AIVelY1 = 0;
				AI1Look = 4;
				break;
			} else if (AIdirection1 == 1 && AIVelY1 != -2 && (printmap[(AIy1 / 64)+1][AIx1 / 64] == 1 || printmap[(AIy1 / 64)+1][AIx1 / 64] == 2)) {
				AIVelX1 = 0;
				AIVelY1 = 2;
				AI1Look = 1;
				break;
			} else if (AIdirection1 == 2 && AIVelY1 != 2 && (printmap[(AIy1 / 64)-1][AIx1 / 64] == 1 || printmap[(AIy1 / 64)-1][AIx1 / 64] == 2)) {
				AIVelX1 = 0;
				AIVelY1 = -2;
				AI1Look = 2;
				break;
			}else if(AIVelX1==2 && printmap[AIy1 / 64][(AIx1 / 64)+1] != 1 && printmap[(AIy1 / 64)+1][AIx1 / 64] != 1 && printmap[(AIy1 / 64)-1][AIx1 / 64] != 1) {
				AIVelX1 = -2;
				AI1Look = 4;
				break;
			}else if(AIVelX1==-2 && printmap[AIy1 / 64][(AIx1 / 64)-1] != 1 && printmap[(AIy1 / 64)+1][AIx1 / 64] != 1 && printmap[(AIy1 / 64)-1][AIx1 / 64] != 1) {
				AIVelX1 = 2;
				AI1Look = 3;
				break;
			}else if(AIVelY1==2 && printmap[(AIy1 / 64)+1][AIx1 / 64] != 1 &&printmap[AIy1 / 64][(AIx1 / 64)-1] != 1 && printmap[AIy1 / 64][(AIx1 / 64)+1] != 1) {
				AIVelY1=-2;
				AI1Look=2;
				break;
			}else if(AIVelY1==-2 && printmap[(AIy1 / 64)-1][AIx1 / 64] != 1 && printmap[AIy1 / 64][(AIx1 / 64)-1] != 1 && printmap[AIy1 / 64][(AIx1 / 64)+1] != 1) {
				AIVelY1=2;
				AI1Look=1;
				break;
			}
			}
		}
		AIx1 = AIx1+AIVelX1;
		AIy1 = AIy1+AIVelY1;
	}
	
	
	if(mapcount > 0 && mapcount < 12 && AI2Health > 0) {
		Random rand = new Random();

			if(AIx2 == 0) {
				AIVelX2 = 2;
				AIVelY2 = 0;
				AI2Look = 3;
			}else if (AIx2 == 960) {
				AIVelX2 = -2;
				AIVelY2 = 0;
				AI2Look = 4;
			}else if(AIy2 == 128) {
				AIVelY2 = 2;
				AIVelX2 = 0;
				AI2Look = 1;
			}else if (AIy2 == 768) {
				AIVelY2 = -2;
				AIVelX2 = 0;
				AI2Look = 2;
			}else if (AIx2 % 64 == 0 && AIy2 % 64 == 0) {
			while (true) {
				AIdirection2 = rand.nextInt(4) + 1;
			if (AIdirection2 == 3 && AIVelX2 != -2 && (printmap[AIy2 / 64][(AIx2 / 64)+1] == 1 || printmap[AIy2 / 64][(AIx2 / 64)+1] == 2)) {
				AIVelX2 = 2;
				AIVelY2 = 0;
				AI2Look = 3;
				break;
			} else if (AIdirection2 == 4 && AIVelX2 != 2 && (printmap[AIy2 / 64][(AIx2 / 64)-1] == 1 || printmap[AIy2 / 64][(AIx2 / 64)-1] == 2)) {
				AIVelX2 = -2;
				AIVelY2 = 0;
				AI2Look = 4;
				break;
			} else if (AIdirection2 == 1 && AIVelY2 != -2 && (printmap[(AIy2 / 64)+1][AIx2 / 64] == 1 || printmap[(AIy2 / 64)+1][AIx2 / 64] == 2)) {
				AIVelX2 = 0;
				AIVelY2 = 2;
				AI2Look = 1;
				break;
			} else if (AIdirection2 == 2 && AIVelY2 != 2 && (printmap[(AIy2 / 64)-1][AIx2 / 64] == 1 || printmap[(AIy2 / 64)-1][AIx2 / 64] == 2)) {
				AIVelX2 = 0;
				AIVelY2 = -2;
				AI2Look = 2;
				break;
			}else if(AIVelX2==2 && printmap[AIy2 / 64][(AIx2 / 64)+1] != 1 && printmap[(AIy2 / 64)+1][AIx2 / 64] != 1 && printmap[(AIy2 / 64)-1][AIx2 / 64] != 1) {
				AIVelX2 = -2;
				AI2Look = 4;
				break;
			}else if(AIVelX2==-2 && printmap[AIy2 / 64][(AIx2 / 64)-1] != 1 && printmap[(AIy2 / 64)+1][AIx2 / 64] != 1 && printmap[(AIy2 / 64)-1][AIx2 / 64] != 1) {
				AIVelX2 = 2;
				AI2Look = 3;
				break;
			}else if(AIVelY2==2 && printmap[(AIy2 / 64)+1][AIx2 / 64] != 1 &&printmap[AIy2 / 64][(AIx2 / 64)-1] != 1 && printmap[AIy2 / 64][(AIx2 / 64)+1] != 1) {
				AIVelY2=-2;
				AI2Look=2;
				break;
			}else if(AIVelY2==-2 && printmap[(AIy2 / 64)-1][AIx2 / 64] != 1 && printmap[AIy2 / 64][(AIx2 / 64)-1] != 1 && printmap[AIy2 / 64][(AIx2 / 64)+1] != 1) {
				AIVelY2=2;
				AI2Look=1;
				break;
			}
			}
		}
		AIx2 = AIx2+AIVelX2;
		AIy2 = AIy2+AIVelY2;
	}
	
	if(mapcount > 0 && mapcount < 12 && AI3Health > 0) {
		Random rand = new Random();

			if(AIx3 == 0) {
				AIVelX3 = 2;
				AIVelY3 = 0;
				AI3Look = 3;
			}else if (AIx3 == 960) {
				AIVelX3 = -2;
				AIVelY3 = 0;
				AI3Look = 4;
			}else if(AIy3 == 128) {
				AIVelY3 = 2;
				AIVelX3 = 0;
				AI3Look = 1;
			}else if (AIy3 == 768) {
				AIVelY3 = -2;
				AIVelX3 = 0;
				AI3Look = 2;
			}else if (AIx3 % 64 == 0 && AIy3 % 64 == 0) {
			while (true) {
				AIdirection3 = rand.nextInt(4) + 1;
			if (AIdirection3 == 3 && AIVelX3 != -2 && (printmap[AIy3 / 64][(AIx3 / 64)+1] == 1 || printmap[AIy3 / 64][(AIx3 / 64)+1] == 2)) {
				AIVelX3 = 2;
				AIVelY3 = 0;
				AI3Look = 3;
				break;
			} else if (AIdirection3 == 4 && AIVelX3 != 2 && (printmap[AIy3 / 64][(AIx3 / 64)-1] == 1 || printmap[AIy3 / 64][(AIx3 / 64)-1] == 2)) {
				AIVelX3 = -2;
				AIVelY3 = 0;
				AI3Look = 4;
				break;
			} else if (AIdirection3 == 1 && AIVelY3 != -2 && (printmap[(AIy3 / 64)+1][AIx3 / 64] == 1 || printmap[(AIy3 / 64)+1][AIx3 / 64] == 2)) {
				AIVelX3 = 0;
				AIVelY3 = 2;
				AI3Look = 1;
				break;
			} else if (AIdirection3 == 2 && AIVelY3 != 2 && (printmap[(AIy3 / 64)-1][AIx3 / 64] == 1 || printmap[(AIy3 / 64)-1][AIx3 / 64] == 2)) {
				AIVelX3 = 0;
				AIVelY3 = -2;
				AI3Look = 2;
				break;
			}else if(AIVelX3==2 && printmap[AIy3 / 64][(AIx3 / 64)+1] != 1 && printmap[(AIy3 / 64)+1][AIx3 / 64] != 1 && printmap[(AIy3 / 64)-1][AIx3 / 64] != 1) {
				AIVelX3 = -2;
				AI3Look = 4;
				break;
			}else if(AIVelX3==-2 && printmap[AIy3 / 64][(AIx3 / 64)-1] != 1 && printmap[(AIy3 / 64)+1][AIx3 / 64] != 1 && printmap[(AIy3 / 64)-1][AIx3 / 64] != 1) {
				AIVelX3 = 2;
				AI3Look = 3;
				break;
			}else if(AIVelY3==2 && printmap[(AIy3 / 64)+1][AIx3 / 64] != 1 &&printmap[AIy3 / 64][(AIx3 / 64)-1] != 1 && printmap[AIy3 / 64][(AIx3 / 64)+1] != 1) {
				AIVelY3=-2;
				AI3Look=2;
				break;
			}else if(AIVelY3==-2 && printmap[(AIy3 / 64)-1][AIx3 / 64] != 1 && printmap[AIy3 / 64][(AIx3 / 64)-1] != 1 && printmap[AIy3 / 64][(AIx3 / 64)+1] != 1) {
				AIVelY3=2;
				AI3Look=1;
				break;
			}
			}
		}
		AIx3 = AIx3+AIVelX3;
		AIy3 = AIy3+AIVelY3;
	}
	
		if(mapcount > 0 && mapcount < 12 && AI4Health > 0) {
		Random rand = new Random();

			if(AIx4 == 0) {
				AIVelX4 = 2;
				AIVelY4 = 0;
				AI4Look = 3;
			}else if (AIx4 == 960) {
				AIVelX4 = -2;
				AIVelY4 = 0;
				AI4Look = 4;
			}else if(AIy4 == 128) {
				AIVelY4 = 2;
				AIVelX4 = 0;
				AI4Look = 1;
			}else if (AIy4 == 768) {
				AIVelY4 = -2;
				AIVelX4 = 0;
				AI4Look = 2;
			}else if (AIx4 % 64 == 0 && AIy4 % 64 == 0) {
			while (true) {
				AIdirection4 = rand.nextInt(4) + 1;
			if (AIdirection4 == 3 && AIVelX4 != -2 && (printmap[AIy4 / 64][(AIx4 / 64)+1] == 1 || printmap[AIy4 / 64][(AIx4 / 64)+1] == 2)) {
				AIVelX4 = 2;
				AIVelY4 = 0;
				AI4Look = 3;
				break;
			} else if (AIdirection4 == 4 && AIVelX4 != 2 && (printmap[AIy4 / 64][(AIx4 / 64)-1] == 1 || printmap[AIy4 / 64][(AIx4 / 64)-1] == 2)) {
				AIVelX4 = -2;
				AIVelY4 = 0;
				AI4Look = 4;
				break;
			} else if (AIdirection4 == 1 && AIVelY4 != -2 && (printmap[(AIy4 / 64)+1][AIx4 / 64] == 1 || printmap[(AIy4 / 64)+1][AIx4 / 64] == 2)) {
				AIVelX4 = 0;
				AIVelY4 = 2;
				AI4Look = 1;
				break;
			} else if (AIdirection4 == 2 && AIVelY4 != 2 && (printmap[(AIy4 / 64)-1][AIx4 / 64] == 1 || printmap[(AIy4 / 64)-1][AIx4 / 64] == 2)) {
				AIVelX4 = 0;
				AIVelY4 = -2;
				AI4Look = 2;
				break;
			}else if(AIVelX4==2 && printmap[AIy4 / 64][(AIx4 / 64)+1] != 1 && printmap[(AIy4 / 64)+1][AIx4 / 64] != 1 && printmap[(AIy4 / 64)-1][AIx4 / 64] != 1) {
				AIVelX4 = -2;
				AI4Look = 4;
				break;
			}else if(AIVelX4==-2 && printmap[AIy4 / 64][(AIx4 / 64)-1] != 1 && printmap[(AIy4 / 64)+1][AIx4 / 64] != 1 && printmap[(AIy4 / 64)-1][AIx4 / 64] != 1) {
				AIVelX4 = 2;
				AI4Look = 3;
				break;
			}else if(AIVelY4==2 && printmap[(AIy4 / 64)+1][AIx4 / 64] != 1 &&printmap[AIy4 / 64][(AIx4 / 64)-1] != 1 && printmap[AIy4 / 64][(AIx4 / 64)+1] != 1) {
				AIVelY4=-2;
				AI4Look=2;
				break;
			}else if(AIVelY4==-2 && printmap[(AIy4 / 64)-1][AIx4 / 64] != 1 && printmap[AIy4 / 64][(AIx4 / 64)-1] != 1 && printmap[AIy4 / 64][(AIx4 / 64)+1] != 1) {
				AIVelY4=2;
				AI4Look=1;
				break;
			}
			}
		}
		AIx4 = AIx4+AIVelX4;
		AIy4 = AIy4+AIVelY4;
	}
	}
	
	
	if (playerInvinc == true) {
		playerInvincTimer++;
	}
	if (playerInvincTimer == 150) {
		playerInvinc = false;
		playerInvincTimer = 0;
	}
	
	
	if (AI1Invinc == true) {
		AI1InvincTimer++;
	}
	if (AI1InvincTimer == 150) {
		AI1Invinc = false;
		AI1InvincTimer = 0;
	}
	
	if (AI2Invinc == true) {
		AI2InvincTimer++;
	}
	if (AI2InvincTimer == 150) {
		AI2Invinc = false;
		AI2InvincTimer = 0;
	}
	
	if (AI3Invinc == true) {
		AI3InvincTimer++;
	}
	if (AI3InvincTimer == 150) {
		AI3Invinc = false;
		AI3InvincTimer = 0;
	}
	
	if (AI4Invinc == true) {
		AI4InvincTimer++;
	}
	if (AI4InvincTimer == 150) {
		AI4Invinc = false;
		AI4InvincTimer = 0;
	}
	
	if (bossInvinc == true) {
		bossInvincTimer++;
	}
	if (bossInvincTimer == 150) {
		bossInvinc = false;
		bossInvincTimer = 0;
	}
	
	if (playerInvincTimer == 15){
		playerInvis=false;
	}
	if (playerInvincTimer == 30){
		playerInvis=true;
	}
	if (playerInvincTimer == 45){
		playerInvis=false;
	}
	if (playerInvincTimer == 60){
		playerInvis=true;
	}
	if (playerInvincTimer == 75){
		playerInvis=false;
	}
	if (playerInvincTimer == 90){
		playerInvis=true;
	}
	if (playerInvincTimer == 105){
		playerInvis=false;
	}
	if (playerInvincTimer == 120){
		playerInvis=true;
	}
	if (playerInvincTimer == 135){
		playerInvis=false;
	}
	if (playerInvincTimer == 150){
		playerInvis=true;
	}
	
	
	if (AI1InvincTimer == 15){
		AI1Invis=false;
	}
	if (AI1InvincTimer == 30){
		AI1Invis=true;
	}
	if (AI1InvincTimer == 45){
		AI1Invis=false;
	}
	if (AI1InvincTimer == 60){
		AI1Invis=true;
	}
	if (AI1InvincTimer == 75){
		AI1Invis=false;
	}
	if (AI1InvincTimer == 90){
		AI1Invis=true;
	}
	if (AI1InvincTimer == 105){
		AI1Invis=false;
	}
	if (AI1InvincTimer == 120){
		AI1Invis=true;
	}
	if (AI1InvincTimer == 135){
		AI1Invis=false;
	}
	if (AI1InvincTimer == 150){
		AI1Invis=true;
	}
	
	if (AI2InvincTimer == 15){
		AI2Invis=false;
	}
	if (AI2InvincTimer == 30){
		AI2Invis=true;
	}
	if (AI2InvincTimer == 45){
		AI2Invis=false;
	}
	if (AI2InvincTimer == 60){
		AI2Invis=true;
	}
	if (AI2InvincTimer == 75){
		AI2Invis=false;
	}
	if (AI2InvincTimer == 90){
		AI2Invis=true;
	}
	if (AI2InvincTimer == 105){
		AI2Invis=false;
	}
	if (AI2InvincTimer == 120){
		AI2Invis=true;
	}
	if (AI2InvincTimer == 135){
		AI2Invis=false;
	}
	if (AI2InvincTimer == 150){
		AI2Invis=true;
	}
	
	
	if (AI3InvincTimer == 15){
		AI3Invis=false;
	}
	if (AI3InvincTimer == 30){
		AI3Invis=true;
	}
	if (AI3InvincTimer == 45){
		AI3Invis=false;
	}
	if (AI3InvincTimer == 60){
		AI3Invis=true;
	}
	if (AI3InvincTimer == 75){
		AI3Invis=false;
	}
	if (AI3InvincTimer == 90){
		AI3Invis=true;
	}
	if (AI3InvincTimer == 105){
		AI3Invis=false;
	}
	if (AI3InvincTimer == 120){
		AI3Invis=true;
	}
	if (AI3InvincTimer == 135){
		AI3Invis=false;
	}
	if (AI3InvincTimer == 150){
		AI3Invis=true;
	}
	
	
	if (AI4InvincTimer == 15){
		AI4Invis=false;
	}
	if (AI4InvincTimer == 30){
		AI4Invis=true;
	}
	if (AI4InvincTimer == 45){
		AI4Invis=false;
	}
	if (AI4InvincTimer == 60){
		AI4Invis=true;
	}
	if (AI4InvincTimer == 75){
		AI4Invis=false;
	}
	if (AI4InvincTimer == 90){
		AI4Invis=true;
	}
	if (AI4InvincTimer == 105){
		AI4Invis=false;
	}
	if (AI4InvincTimer == 120){
		AI4Invis=true;
	}
	if (AI4InvincTimer == 135){
		AI4Invis=false;
	}
	if (AI4InvincTimer == 150){
		AI4Invis=true;
	}
	
	if (bossInvincTimer == 15){
		bossInvis=false;
	}
	if (bossInvincTimer == 30){
		bossInvis=true;
	}
	if (bossInvincTimer == 45){
		bossInvis=false;
	}
	if (bossInvincTimer == 60){
		bossInvis=true;
	}
	if (bossInvincTimer == 75){
		bossInvis=false;
	}
	if (bossInvincTimer == 90){
		bossInvis=true;
	}
	if (bossInvincTimer == 105){
		bossInvis=false;
	}
	if (bossInvincTimer == 120){
		bossInvis=true;
	}
	if (bossInvincTimer == 135){
		bossInvis=false;
	}
	if (bossInvincTimer == 150){
		bossInvis=true;
	}
	
	AI1PewNum = 0;
	if (AI1PewCount == 1) {
		AI1PewCount = 0;
	}
	
	if(AI1Health<=0 && ItemDropCollect1 == false && ItemDrop1 == 0) {
		AI1ItemDropPut = 1;
	}
	
	if (AI1ItemDropPut==1) {
		if (missileCollect==true && (missileCapacity < maxMissile || PlayerDamage!=0)) {
			Random rand = new Random();
			AI1ItemDrop = rand.nextInt(5)+1;
			if (AI1ItemDrop >= 4 && AI1ItemDrop < 5) {
				ItemDrop1 = 1;
				AI1ItemDropPut--;
			}else if (AI1ItemDrop == 5) {
				ItemDrop1=2;
				AI1ItemDropPut--;
			}
		}else if (missileCollect==false && PlayerDamage!=0) {
			Random rand = new Random();
			AI1ItemDrop = rand.nextInt(4)+1;
			if (AI1ItemDrop >= 4) {
				ItemDrop1 = 1;
				AI1ItemDropPut--;
			}
		}
	}
	
	AI2PewNum = 0;
	if (AI2PewCount == 1) {
		AI2PewCount = 0;
	}
	
	if(AI2Health<=0 && ItemDropCollect2 == false && ItemDrop2 == 0) {
		AI2ItemDropPut = 1;
	}
	
	if (AI2ItemDropPut==1) {
		if (missileCollect==true && (missileCapacity < maxMissile || PlayerDamage!=0)) {
			Random rand = new Random();
			AI2ItemDrop = rand.nextInt(5)+1;
			if (AI2ItemDrop >= 4 && AI2ItemDrop < 5) {
				ItemDrop2 = 1;
				AI2ItemDropPut--;
			}else if (AI2ItemDrop == 5) {
				ItemDrop2=2;
				AI2ItemDropPut--;
			}
		}else if (missileCollect==false && PlayerDamage!=0) {
			Random rand = new Random();
			AI2ItemDrop = rand.nextInt(4)+1;
			if (AI2ItemDrop >= 4) {
				ItemDrop2 = 1;
				AI2ItemDropPut--;
			}
		}
	}
	
	
	AI3PewNum = 0;
	if (AI3PewCount == 1) {
		AI3PewCount = 0;
	}
	
	if(AI3Health<=0 && ItemDropCollect3 == false && ItemDrop3 == 0) {
		AI3ItemDropPut = 1;
	}
	
	if (AI3ItemDropPut==1) {
		if (missileCollect==true && (missileCapacity < maxMissile || PlayerDamage!=0)) {
			Random rand = new Random();
			AI3ItemDrop = rand.nextInt(5)+1;
			if (AI3ItemDrop >= 4 && AI3ItemDrop < 5) {
				ItemDrop3 = 1;
				AI3ItemDropPut--;
			}else if (AI3ItemDrop == 5) {
				ItemDrop3=2;
				AI3ItemDropPut--;
			}
		}else if (missileCollect==false && PlayerDamage!=0) {
			Random rand = new Random();
			AI3ItemDrop = rand.nextInt(4)+1;
			if (AI3ItemDrop >= 4) {
				ItemDrop3 = 1;
				AI3ItemDropPut--;
			}
		}
	}
	
	
	AI4PewNum = 0;
	if (AI4PewCount == 1) {
		AI4PewCount = 0;
	}
	
	if(AI4Health<=0 && ItemDropCollect4 == false && ItemDrop4 == 0) {
		AI4ItemDropPut = 1;
	}
	
	if (AI4ItemDropPut==1) {
		if (missileCollect==true && (missileCapacity < maxMissile || PlayerDamage!=0)) {
			Random rand = new Random();
			AI4ItemDrop = rand.nextInt(5)+1;
			if (AI4ItemDrop >= 4 && AI4ItemDrop < 5) {
				ItemDrop4 = 1;
				AI4ItemDropPut--;
			}else if (AI4ItemDrop == 5) {
				ItemDrop4=2;
				AI4ItemDropPut--;
			}
		}else if (missileCollect==false && PlayerDamage!=0) {
			Random rand = new Random();
			AI4ItemDrop = rand.nextInt(4)+1;
			if (AI4ItemDrop >= 4) {
				ItemDrop4 = 1;
				AI4ItemDropPut--;
			}
		}
	}
	
	if (bossHealth<=0) {
		map15[4][1] = 24;
		map15[4][2] = 24;
		map15[4][3] = 24;
		map15[4][4] = 24;
		map15[4][5] = 24;

		map15[5][1] = 24;
		map15[5][2] = 24;
		map15[5][3] = 24;
		map15[5][4] = 24;
		map15[5][5] = 24;

		map15[6][1] = 24;
		map15[6][2] = 24;
		map15[6][3] = 24;
		map15[6][4] = 24;
		map15[6][5] = 24;

		map15[7][1] = 24;
		map15[7][2] = 24;
		map15[7][3] = 24;
		map15[7][4] = 24;
		map15[7][5] = 24;
	}
	
		collision();
		
		repaint();
	}
	
	//Making screen (REALLY important)
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		//Map changing
		if (PlayerHP >= PlayerDamage) {
		if (mapcount!=12){
		if (chary == 124) {
			mapcount++;
			temp=1;
			tempAI1Put=1;
			tempAI2Put=1;
		  tempAI3Put=1;
		  tempAI4Put=1;
		 

		}else if (chary == 878) {
			mapcount--;
			temp = 2;
			tempAI1Put=1;
				tempAI2Put=1;
			  tempAI3Put=1;
			  tempAI4Put=1;
			
		}
		}
		if (mapcount == 12) {
			if (chary == 878) {
				mapcount = tempMapCount;
				temp = 3;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
			}
		}
	
		if (mapcount != 9 && mapcount != 10 && mapcount != 13 && mapcount != 14) {
		if (charx == 1010) {
			mapcount++;
			temp = 1;
			tempAI1Put=1;
				tempAI2Put=1;
			  tempAI3Put=1;
			  tempAI4Put=1;
			 
		}else if (charx == -22) {
			mapcount--;
			temp = 2;
			tempAI1Put=1;
				tempAI2Put=1;
			  tempAI3Put=1;
			  tempAI4Put=1;
			 
		}
		}
		if (mapcount == 10) {
			if (charx == 1010) {
				mapcount--;
				temp = 2;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
			}
		}
		if (mapcount == 14) {
			if (charx == 1010) {
				mapcount--;
				temp = 2;
				charx=-10;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
			}
		}
		if (mapcount == 9) {
			if (charx == -22) {
				mapcount++;
				temp = 1;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
			}			
		}
		
		if (mapcount == 13) {
			if (charx == -22) {
				mapcount++;
				temp = 1;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
			}
			if (charx == 1010) {
				mapcount=11;
				charx=462;
				chary=450;
				temp=2;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
			}
		}
		
		
		if (mapcount == 0 && temp == 2) {
			printmap = map;
			if (temp == 2){
				charx = 990;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
				}
		}
		if (mapcount == 1){
			printmap=map2;
			blastWallX = 384;
			blastWallY = 576;
			if (temp == 1){
			charx = -10;
			temp--;
			}
			if (tempAI1Put == 1) {
				AIx1 = 128;
				AIy1 = 256;
				AI1Health=2;
				tempAI1Put--;
				AI1Type = 1;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}
			
			if (tempAI2Put == 1) {
				AIx2 = 128;
				AIy2 = 576;
				AI2Health=2;
				tempAI2Put--;
				AI2Type = 1;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 896;
				AIy3 = 128;
				AI3Health=2;
				tempAI3Put--;
				AI3Type = 1;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 896;
				AIy4 = 576;
				AI4Health=2;
				tempAI4Put--;
				AI4Type = 1;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
		}
		if (mapcount == 1 && temp == 2) {
			printmap = map2;
			if (temp == 2){
				chary = 124;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
				}
		}
		if (mapcount == 2) {
			printmap=map3;
			blastWallX = 64;
			blastWallY = 448;
			if (temp==1) {
				chary=806;
				temp--;
			}
			if (tempAI1Put == 1) {
				AIx1 = 256;
				AIy1 = 384;
				AI1Health=2;
				tempAI1Put--;
				AI1Type = 1;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}

			if (tempAI2Put == 1) {
				AIx2 = 356;
				AIy2 = 512;
				AI2Health=2;
				tempAI2Put--;
				AI2Type = 1;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 576;
				AIy3 = 384;
				AI3Health=2;
				tempAI3Put--;
				AI3Type = 1;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 576;
				AIy4 = 512;
				AI4Health=2;
				tempAI4Put--;
				AI4Type = 1;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
		}
		if (mapcount == 2 && temp == 2) {
			printmap = map3;
			if (temp == 2){
				charx = 990;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
				}
		}
		if (mapcount == 3) {
			printmap=map4;
			blastWallX = 832;
			blastWallY = 704;
			if (temp==1) {
				charx=-10;
				temp--;
				AI5Health=1;
				SpecialPewTimer = 0;
			}
			if (tempAI1Put == 1) {
				AIx1 = 128;
				AIy1 = 256;
				AI1Health=4;
				tempAI1Put--;
				AI1Type = 2;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}

			if (tempAI2Put == 1) {
				AIx2 = 128;
				AIy2 = 640;
				AI2Health=2;
				tempAI2Put--;
				AI2Type = 1;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 960;
				AIy3 = 448;
				AI3Health=2;
				tempAI3Put--;
				AI3Type = 1;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 960;
				AIy4 = 640;
				AI4Health=2;
				tempAI4Put--;
				AI4Type = 1;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
		}
		if (mapcount == 3 && temp == 2) {
			printmap = map4;
			if (temp == 2){
				charx = 990;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				  SpecialPewTimer = 0;
				 
				}
		}
		//TODO put correct ai locations down below, they aren't done yet
		if (mapcount == 4) {
			printmap=map5;
			blastWallX = 640;
			blastWallY = 192;
			if (temp==1) {
				charx=-10;
				temp--;
				AI5Health=1;
				SpecialPewTimer = 0;
			}
			if (tempAI1Put == 1) {
				AIx1 = 0;
				AIy1 = 640;
				AI1Health=4;
				tempAI1Put--;
				AI1Type = 2;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}

			if (tempAI2Put == 1) {
				AIx2 = 0;
				AIy2 = 448;
				AI2Health=2;
				tempAI2Put--;
				AI2Type = 1;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 960;
				AIy3 = 256;
				AI3Health=4;
				tempAI3Put--;
				AI3Type = 2;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 960;
				AIy4 = 640;
				AI4Health=2;
				tempAI4Put--;
				AI4Type = 1;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
		}
		if (mapcount == 4 && temp == 2) {
			printmap = map5;
			if (temp == 2){
				charx = 990;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				  SpecialPewTimer = 0;
				 
				}
		}
		if (mapcount == 5) {
			printmap=map6;
			blastWallX = 704;
			blastWallY = 192;
			if (temp==1) {
				charx=-10;
				temp--;
			}
			if (tempAI1Put == 1) {
				AIx1 = 192;
				AIy1 = 128;
				AI1Health=4;
				tempAI1Put--;
				AI1Type = 2;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}

			if (tempAI2Put == 1) {
				AIx2 = 832;
				AIy2 = 128;
				AI2Health=2;
				tempAI2Put--;
				AI2Type = 1;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 192;
				AIy3 = 640;
				AI3Health=4;
				tempAI3Put--;
				AI3Type = 2;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 832;
				AIy4 = 640;
				AI4Health=6;
				tempAI4Put--;
				AI4Type = 3;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
			
		}
		if (mapcount == 5 && temp == 2) {
			printmap = map6;
			if (temp == 2){
				chary = 124;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
				}
		}
		if (mapcount == 6) {
			printmap=map7;
			blastWallX = 896;
			blastWallY = 704;
			if (temp==1) {
				chary=806;
				temp--;
			}
			if (tempAI1Put == 1) {
				AIx1 = 128;
				AIy1 = 256;
				AI1Health=4;
				tempAI1Put--;
				AI1Type = 2;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}

			if (tempAI2Put == 1) {
				AIx2 = 832;
				AIy2 = 256;
				AI2Health=4;
				tempAI2Put--;
				AI2Type = 2;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 128;
				AIy3 = 640;
				AI3Health=6;
				tempAI3Put--;
				AI3Type = 3;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 832;
				AIy4 = 640;
				AI4Health=8;
				tempAI4Put--;
				AI4Type = 4;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
		}
		if (mapcount == 6 && temp == 2) {
			printmap = map7;
			if (temp == 2){
				charx = 990;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
				}
		}
		if (mapcount == 7) {
			printmap=map8;
			blastWallX = 704;
			blastWallY = 640;
			if (temp==1) {
				charx=-10;
				temp--;
			}
			if (tempAI1Put == 1) {
				AIx1 = 832;
				AIy1 = 384;
				AI1Health=2;
				tempAI1Put--;
				AI1Type = 1;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}

			if (tempAI2Put == 1) {
				AIx2 = 960;
				AIy2 = 384;
				AI2Health=2;
				tempAI2Put--;
				AI2Type = 1;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 832;
				AIy3 = 512;
				AI3Health=2;
				tempAI3Put--;
				AI3Type = 1;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 960;
				AIy4 = 512;
				AI4Health=2;
				tempAI4Put--;
				AI4Type = 1;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
		}
		if (mapcount == 7 && temp == 2) {
			printmap = map8;
			if (temp == 2){
				charx = 990;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
				}
		}
		if (mapcount == 8) {
			printmap=map9;
			blastWallX = 192;
			blastWallY = 768;
			if (temp==1) {
				charx=-10;
				temp--;
			}
			if (tempAI1Put == 1) {
				AIx1 = 256;
				AIy1 = 384;
				AI1Health=4;
				tempAI1Put--;
				AI1Type = 2;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}

			if (tempAI2Put == 1) {
				AIx2 = 704;
				AIy2 = 384;
				AI2Health=6;
				tempAI2Put--;
				AI2Type = 3;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 256;
				AIy3 = 512;
				AI3Health=6;
				tempAI3Put--;
				AI3Type = 3;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 704;
				AIy4 = 512;
				AI4Health=8;
				tempAI4Put--;
				AI4Type = 4;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
		}
		if (mapcount == 8 && temp == 2) {
			printmap = map9;
			if (temp == 2){
				chary = 124;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
				}
		}
		if (mapcount == 9) {
			printmap=map10;
			blastWallX = 704;
			blastWallY = 448;
			if (temp==1) {
				chary=806;
				temp--;
			}
			if (tempAI1Put == 1) {
				AIx1 = 128;
				AIy1 = 320;
				AI1Health=6;
				tempAI1Put--;
				AI1Type = 3;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}

			if (tempAI2Put == 1) {
				AIx2 = 128;
				AIy2 = 576;
				AI2Health=6;
				tempAI2Put--;
				AI2Type = 3;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 768;
				AIy3 = 320;
				AI3Health=6;
				tempAI3Put--;
				AI3Type = 3;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 768;
				AIy4 = 576;
				AI4Health=8;
				tempAI4Put--;
				AI4Type = 4;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
		}
		if (mapcount == 9 && temp == 2) {
			printmap = map10;
			if (temp == 2){
				charx = -10;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
				}
		}
		if (mapcount == 10) {
			printmap=map11;
			blastWallX = 192;
			blastWallY = 704;
			if (temp==1) {
				charx=990;
				chary = 416;
				temp--;
			}
			if (tempAI1Put == 1) {
				AIx1 = 128;
				AIy1 = 256;
				AI1Health=6;
				tempAI1Put--;
				AI1Type = 3;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}

			if (tempAI2Put == 1) {
				AIx2 = 128;
				AIy2 = 640;
				AI2Health=6;
				tempAI2Put--;
				AI2Type = 3;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 768;
				AIy3 = 256;
				AI3Health=8;
				tempAI3Put--;
				AI3Type = 4;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 768;
				AIy4 = 640;
				AI4Health=8;
				tempAI4Put--;
				AI4Type = 4;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
		}
		if (mapcount == 10 && temp == 2) {
			printmap = map11;
			if (temp == 2){
				chary = 124;
				temp=0;
				tempAI1Put=1;
					tempAI2Put=1;
				  tempAI3Put=1;
				  tempAI4Put=1;
				 
				}
		}
		if (mapcount == 11) {
			printmap=map12;
			blastWallX = 256;
			blastWallY = 192;
			if (temp==1) {
				chary=806;
				temp--;
			}
		if (mapcount>12) {
			blastWallX=0;
			blastWallY=0;
		}
			if (tempAI1Put == 1) {
				AIx1 = 256;
				AIy1 = 384;
				AI1Health=8;
				tempAI1Put--;
				AI1Type = 4;
				ItemDropCollect1 = false;
				ItemDrop1 = 0;
			}

			if (tempAI2Put == 1) {
				AIx2 = 256;
				AIy2 = 512;
				AI2Health=8;
				tempAI2Put--;
				AI2Type = 4;
				ItemDropCollect2 = false;
				ItemDrop2 = 0;
			}
			
			if (tempAI3Put == 1) {
				AIx3 = 640;
				AIy3 = 384;
				AI3Health=8;
				tempAI3Put--;
				AI3Type = 4;
				ItemDropCollect3 = false;
				ItemDrop3 = 0;
			}
			
			if (tempAI4Put == 1) {
				AIx4 = 640;
				AIy4 = 512;
				AI4Health=8;
				tempAI4Put--;
				AI4Type = 4;
				ItemDropCollect4 = false;
				ItemDrop4 = 0;
			}
			
		}
		
		if (mapcount==12) {
			printmap=map13;
			if (temp==1) {
				charx = 500;
				chary = 806;
				temp--;
			}
		}
		
		//Exiting item rooms
		
		if (mapcount == 0 && temp == 3) {
			printmap = map;
			charx = 276;
			chary = 234;
			temp = 0;
		}
		if (mapcount == 1 && temp == 3) {
			printmap = map2;
			charx = 384;
			chary = 640;
			temp = 0;
		}
		if (mapcount == 2 && temp == 3) {
			printmap = map3;
			charx = 140;
			chary = 448;
			temp = 0;
		}
		if (mapcount == 3 && temp == 3) {
			printmap = map4;
			charx = 832;
			chary = 600;
			temp = 0;
		}
		if (mapcount == 4 && temp == 3) {
			printmap = map5;
			charx = 640;
			chary = 256;
			temp = 0;
		}
		if (mapcount == 5 && temp == 3) {
			printmap = map6;
			charx = 768;
			chary = 128;
			temp = 0;
		}
		if (mapcount == 6 && temp == 3) {
			printmap = map7;
			charx = 896;
			chary = 600;
			temp = 0;
		}
		if (mapcount == 7 && temp == 3) {
			printmap = map8;
			charx = 768;
			chary = 640;
			temp = 0;
		}
		if (mapcount == 8 && temp == 3) {
			printmap = map9;
			charx = 192;
			chary = 684;
			temp = 0;
		}
		if (mapcount == 9 && temp == 3) {
			printmap = map10;
			charx = 704;
			chary = 512;
			temp = 0;
		}
		if (mapcount == 10 && temp == 3) {
			printmap = map11;
			charx = 192;
			chary = 600;
			temp = 0;
		}
		if (mapcount == 11 && temp == 3) {
			printmap = map12;
			charx = 256;
			chary = 256;
			temp = 0;
		}
		if (mapcount == 13) {
			printmap=map14;
			if (temp==1) {
				charx = 990;
				chary = 640;
				temp--;
			}
		}
		if (mapcount == 11&& temp==2) {
			printmap=map12;
			temp=0;
			tempAI1Put=1;
				tempAI2Put=1;
			  tempAI3Put=1;
			  tempAI4Put=1;
			 
		}
		if (mapcount == 14) {
			printmap=map15;
			if (temp==1) {
				charx = 990;
				bossHealth=40;
				map15[4][1] = 40;
				map15[4][2] = 28;
				map15[4][3] = 28;
				map15[4][4] = 28;
				map15[4][5] = 28;

				map15[5][1] = 28;
				map15[5][2] = 28;
				map15[5][3] = 28;
				map15[5][4] = 28;
				map15[5][5] = 28;

				map15[6][1] = 28;
				map15[6][2] = 28;
				map15[6][3] = 28;
				map15[6][4] = 28;
				map15[6][5] = 28;

				map15[7][1] = 28;
				map15[7][2] = 28;
				map15[7][3] = 28;
				map15[7][4] = 28;
				map15[7][5] = 28;
				glassBreak=false;
				SpecialPewTimer = 0;
				temp--;
			}
		}
		if (mapcount == 13&& temp==2) {
			printmap=map14;
			charx=-10;
			temp=0;
		}
		
		if (mapcount == 14 && charx<-22 && temppoint==0) {
			winScreen=true;
			temppoint=2;
		}
		
		//making screen
		for(int row = 0; row < printmap.length; row++) {
			for(int col = 0; col < printmap[0].length; col++) {
				
				if(printmap[row][col] == 0) {
					mapPart5.paintIcon(this,g,col*64,row*64);
				}
				if(printmap[row][col] == 1) {
					g.setColor(new Color(255, 192, 122));
					g.fillRect(col*64,row*64,64,64);
				}else if(printmap[row][col] == 2) {
					g.setColor(new Color(0,0,0));
					g.fillRect(col*64,row*64,64,64);

				}else if(printmap[row][col] == 2) {
					g.setColor(new Color(0,0,0));
					g.fillRect(col*64,row*64,64,64);
				}
				if(printmap[row][col] == 3) {
					mapPart4.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 4) {
					mapPart2.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 5) {
					mapPart3.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 6) {
					mapPart1.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 7) {
					mapPart6.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 8) {
					mapPart8.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 9) {
					mapPart10.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 10) {
					mapPart11.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 11) {
					mapPart13.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 12) {
					mapPart14.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 13) {
					mapPart12.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 14) {
					mapPart15.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 15) {
					mapPart16.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 16) {
					mapPart17.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 17) {
					mapPart18.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 18) {
					mapPart19.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 19) {
					mapPart20.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 20) {
					mapPart21.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 21) {
					mapPart22.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 22) {
					mapPart23.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 23) {
					mapPart24.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 24) {
					g.setColor(new Color(0,0,0));
					g.fillRect(col*64,row*64,64,64);
				}else if(printmap[row][col] == 25) {
					g.setColor(new Color(0,0,0));
					g.fillRect(col*64,row*64,64,64);
				}else if(printmap[row][col] == 26) {
					mapPart63.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 28) {
					mapPart57.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 29) {
					mapPart60.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 30) {
					mapPart54.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 31) {
					mapPart62.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 32) {
					mapPart61.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 33) {
					mapPart56.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 34) {
					mapPart55.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 35) {
					mapPart59.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 36) {
					mapPart65.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 37) {
					mapPart66.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 38) {
					mapPart67.paintIcon(this,g,col*64,row*64);
				}
			}
		}
		
		if (mapcount==14) {
		g.setColor(new Color(0,0,0));
		g.fillRect(64,256,64,64);
		g.fillRect(128,256,64,64);
		g.fillRect(192,256,64,64);
		g.fillRect(256,256,64,64);
		g.fillRect(320,256,64,64);
		
		g.fillRect(64,320,64,64);
		g.fillRect(128,320,64,64);
		g.fillRect(192,320,64,64);
		g.fillRect(256,320,64,64);
		g.fillRect(320,320,64,64);
		
		g.fillRect(64,384,64,64);
		g.fillRect(128,384,64,64);
		g.fillRect(192,384,64,64);
		g.fillRect(256,384,64,64);
		g.fillRect(320,384,64,64);
		
		g.fillRect(64,448,64,64);
		g.fillRect(128,448,64,64);
		g.fillRect(192,448,64,64);
		g.fillRect(256,448,64,64);
		g.fillRect(320,448,64,64);
		}
		
		
		for(int row = 0; row < printmap.length; row++) {
			for(int col = 0; col < printmap[0].length; col++) {
				if(printmap[row][col] == 39) {
					mapPart71.paintIcon(this,g,col*64,row*64);
				}
				if (bossInvis == false) {
					if (bossHealth>0) {
				if(printmap[row][col] == 40) {
					mapPart69.paintIcon(this,g,col*64,row*64);
				}else if(printmap[row][col] == 41) {
					mapPart70.paintIcon(this,g,col*64,row*64);
				}
					}
				}
			}
		}
		
		if (mapcount==14 && glassBreak==true) {
			g.setColor(new Color(0,0,0));
			g.fillRect(350,384,34,64);
		}
		
		if (mapcount == 12) {
			//item cave fire
			mapPart44.paintIcon(this,g,288,384);
			mapPart44.paintIcon(this,g,672,384);
			//blaster item
			if (!blasterCollect) {
			if (tempMapCount == 0) {
				mapPart41.paintIcon(this,g,493,384);
			}
			}
			//missle item
			if (!missileCollect) {
				if (tempMapCount == 2) {
				mapPart40.paintIcon(this,g,493,384);
			}
			}
			//energy tank 1
			if (!eTank1) {
				if (tempMapCount == 1) {
				mapPart42.paintIcon(this,g,480,384);
			}
			}
			//energy tank 2
			if (!eTank2) {
				if (tempMapCount == 3) {
				mapPart42.paintIcon(this,g,480,384);
			}
			}
			//energy tank 3
			if (!eTank3) {
				if (tempMapCount == 4) {
				mapPart42.paintIcon(this,g,480,384);
			}
			}
			//energy tank 4
			if (!eTank4) {
				if (tempMapCount == 5) {
				mapPart42.paintIcon(this,g,480,384);
			}
			}
			//energy tank 5
			if (!eTank5) {
				if (tempMapCount == 9) {
				mapPart42.paintIcon(this,g,480,384);
			}
			}
			//energy tank 6
			if (!eTank6) {
				if (tempMapCount == 7) {
				mapPart42.paintIcon(this,g,480,384);
			}
			}
			//energy tank 7
			if (!eTank7) {
				if (tempMapCount == 11) {
				mapPart42.paintIcon(this,g,480,384);
			}
			}
			//missile expansion 1
			if (!missleExpansion1) {
				if (tempMapCount == 10) {
				mapPart43.paintIcon(this,g,480,384);
			}
			}
			//missile expansion 2
			if (!missleExpansion2) {
				if (tempMapCount == 6) {
				mapPart43.paintIcon(this,g,480,384);
			}
			}
			//missile expansion 3
			if (!missleExpansion3) {
				if (tempMapCount == 8) {
				mapPart43.paintIcon(this,g,480,384);
			}
			}
		}

		if (playerInvis == false){
		if (playerLook==3 && (VelY!=0 && mapcount>12) || playerLook == 7 && (VelY!=0 && mapcount>12)){
			mapPart83.paintIcon(this,g,charx,chary);
		}else if (playerLook==4 && (VelY!=0 && mapcount>12) ||playerLook == 8 && (VelY!=0 && mapcount>12)){
			mapPart84.paintIcon(this,g,charx,chary);
		}else if (playerLook == 1) {
			mapPart30.paintIcon(this,g,charx,chary);		
		}else if (playerLook == 2) {
			mapPart31.paintIcon(this,g,charx,chary);		
		}else if (playerLook == 3) {
			mapPart32.paintIcon(this,g,charx,chary);		
		}else if (playerLook == 4) {
			mapPart33.paintIcon(this,g,charx,chary);		
		}else if (playerLook == 5) {
			mapPart34.paintIcon(this,g,charx,chary);
		}else if (playerLook == 6) {
			mapPart35.paintIcon(this,g,charx,chary);
		}else if (playerLook == 7) {
			mapPart36.paintIcon(this,g,charx,chary);
		}else if (playerLook == 8) {
			mapPart37.paintIcon(this,g,charx,chary);
		}
		}
		
		for (int i = 0; i < weaponblast.length; i++) {
			if (WeaponToggle%2 == 0) {
				mapPart29.paintIcon(this,g,weaponblast[i].x, weaponblast[i].y);
			}
			if (missileCollect) {
			if (WeaponToggle%2 != 0) {
				if (playerLook == 1 || playerLook == 5) {
					mapPart46.paintIcon(this,g,weaponblast[i].x, weaponblast[i].y);
				}else if(playerLook == 2 || playerLook == 6) {
					mapPart47.paintIcon(this,g,weaponblast[i].x, weaponblast[i].y);
				}else if(playerLook == 3 || playerLook == 7) {
					mapPart48.paintIcon(this,g,weaponblast[i].x, weaponblast[i].y);
				}else if(playerLook == 4 || playerLook == 8) {
					mapPart49.paintIcon(this,g,weaponblast[i].x, weaponblast[i].y);
				}
			}
			}
		}

			if(mapcount==3  && AI5Health>0 ||mapcount==4 && AI5Health>0 ) {
				if (AI5Invis==false) {
				mapPart86.paintIcon(this,g,AI5x,AI5y);
				}
				mapPart85.paintIcon(this,g,SpecialPew.x1, SpecialPew.y1);
			}
			if(mapcount==14&&bossHealth>0) {
				mapPart68.paintIcon(this,g,SpecialPew.x1, SpecialPew.y1);
			}
		
		g.setColor(new Color(0,0,0));
		g.fillRect(0,0,1024,128);
		mapPart9.paintIcon(this,g,32,32);
		//item boxes in menu
		mapPart7.paintIcon(this,g,880,10);
		mapPart7.paintIcon(this,g,750,10);
		if (WeaponToggle%2 == 0) {
			mapPart50.paintIcon(this,g,785,10);
		}else if (WeaponToggle%2 != 0) {
			mapPart50.paintIcon(this,g,915,10);
		}
		
		//health squares
		
		for(int i = 0; i < healthBarSize.length; i++) {
			
			mapPart38.paintIcon(this,g,HPBarX,44);
			HPBarX = HPBarX + 60;
		}
		tempHPBarX = HPBarX - 60;
		HPBarX = 110;
		if (PlayerDamage > 0 && PlayerHP > PlayerDamage) {
			PlayerDamageSize = new int [PlayerDamage];
			for(int i = 0; i < PlayerDamageSize.length; i++) {
				mapPart39.paintIcon(this,g,tempHPBarX,44);
				tempHPBarX = tempHPBarX - 60;
			}
		}
		
		//blaster
		if (blasterCollect) {
		mapPart41.paintIcon(this,g,782,30);
		}

		
		if (AI1Invis == false) {
		if (mapcount > 0 && mapcount < 12 && AI1Health >0 && AI1Type==1) {
		if (AI1Look == 1) {
		mapPart25.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 4) {
		mapPart26.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 3) {
		mapPart27.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 2) {
			mapPart28.paintIcon(this,g,AIx1,AIy1);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI1Health >0 && AI1Type==2) {
		if (AI1Look == 1) {
		mapPart52.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 4) {
		mapPart53.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 3) {
		mapPart58.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 2) {
			mapPart64.paintIcon(this,g,AIx1,AIy1);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI1Health >0 && AI1Type==3) {
		if (AI1Look == 1) {
		mapPart72.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 4) {
		mapPart73.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 3) {
		mapPart74.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 2) {
			mapPart75.paintIcon(this,g,AIx1,AIy1);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI1Health >0 && AI1Type==4) {
		if (AI1Look == 1) {
		mapPart76.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 4) {
		mapPart77.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 3) {
		mapPart78.paintIcon(this,g,AIx1,AIy1);
		}
		if (AI1Look == 2) {
			mapPart79.paintIcon(this,g,AIx1,AIy1);
		}
		}
		}
		
		
		if (AI2Invis == false) {
		if (mapcount > 0 && mapcount < 12 && AI2Health >0 && AI2Type==1) {
		if (AI2Look == 1) {
		mapPart25.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 4) {
		mapPart26.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 3) {
		mapPart27.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 2) {
			mapPart28.paintIcon(this,g,AIx2,AIy2);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI2Health >0 && AI2Type==2) {
		if (AI2Look == 1) {
		mapPart52.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 4) {
		mapPart53.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 3) {
		mapPart58.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 2) {
			mapPart64.paintIcon(this,g,AIx2,AIy2);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI2Health >0 && AI2Type==3) {
		if (AI2Look == 1) {
		mapPart72.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 4) {
		mapPart73.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 3) {
		mapPart74.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 2) {
			mapPart75.paintIcon(this,g,AIx2,AIy2);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI2Health >0 && AI2Type==4) {
		if (AI2Look == 1) {
		mapPart76.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 4) {
		mapPart77.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 3) {
		mapPart78.paintIcon(this,g,AIx2,AIy2);
		}
		if (AI2Look == 2) {
			mapPart79.paintIcon(this,g,AIx2,AIy2);
		}
		}
		}
		
		
		if (AI3Invis == false) {
		if (mapcount > 0 && mapcount < 12 && AI3Health >0 && AI3Type==1) {
		if (AI3Look == 1) {
		mapPart25.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 4) {
		mapPart26.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 3) {
		mapPart27.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 2) {
			mapPart28.paintIcon(this,g,AIx3,AIy3);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI3Health >0 && AI3Type==2) {
		if (AI3Look == 1) {
		mapPart52.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 4) {
		mapPart53.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 3) {
		mapPart58.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 2) {
			mapPart64.paintIcon(this,g,AIx3,AIy3);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI3Health >0 && AI3Type==3) {
		if (AI3Look == 1) {
		mapPart72.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 4) {
		mapPart73.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 3) {
		mapPart74.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 2) {
			mapPart75.paintIcon(this,g,AIx3,AIy3);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI3Health >0 && AI3Type==4) {
		if (AI3Look == 1) {
		mapPart76.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 4) {
		mapPart77.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 3) {
		mapPart78.paintIcon(this,g,AIx3,AIy3);
		}
		if (AI3Look == 2) {
			mapPart79.paintIcon(this,g,AIx3,AIy3);
		}
		}
		}
		
		
		if (AI4Invis == false) {
		if (mapcount > 0 && mapcount < 12 && AI4Health >0 && AI4Type==1) {
		if (AI4Look == 1) {
		mapPart25.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 4) {
		mapPart26.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 3) {
		mapPart27.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 2) {
			mapPart28.paintIcon(this,g,AIx4,AIy4);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI4Health >0 && AI4Type==2) {
		if (AI4Look == 1) {
		mapPart52.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 4) {
		mapPart53.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 3) {
		mapPart58.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 2) {
			mapPart64.paintIcon(this,g,AIx4,AIy4);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI4Health >0 && AI4Type==3) {
		if (AI4Look == 1) {
		mapPart72.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 4) {
		mapPart73.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 3) {
		mapPart74.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 2) {
			mapPart75.paintIcon(this,g,AIx4,AIy4);
		}
		}
		if (mapcount > 0 && mapcount < 12 && AI4Health >0 && AI4Type==4) {
		if (AI4Look == 1) {
		mapPart76.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 4) {
		mapPart77.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 3) {
		mapPart78.paintIcon(this,g,AIx4,AIy4);
		}
		if (AI4Look == 2) {
			mapPart79.paintIcon(this,g,AIx4,AIy4);
		}
		}
		}
		
		
		if (mapcount > 0 && mapcount < 12 && AI1Health >0) {
		mapPart81.paintIcon(this,g,EnemyPew[0].x, EnemyPew[0].y);
		}
		if(mapcount > 0 && mapcount < 12 && AI1Health <= 0 && ItemDrop1==1 && PlayerDamage != 0) {
			mapPart80.paintIcon(this,g,AIx1+16,AIy1+16);
		}
		if(mapcount > 0 && mapcount < 12 && AI1Health <=0 && ItemDrop1==2 && missileCapacity<maxMissile) {
			mapPart46.paintIcon(this,g,AIx1+25,AIy1+21);
		}
		
		if (mapcount > 0 && mapcount < 12 && AI2Health >0) {
		mapPart81.paintIcon(this,g,EnemyPew[0].x, EnemyPew[0].y);
		}
		if(mapcount > 0 && mapcount < 12 && AI2Health <= 0 && ItemDrop2==1 && PlayerDamage != 0) {
			mapPart80.paintIcon(this,g,AIx2+16,AIy2+16);
		}
		if(mapcount > 0 && mapcount < 12 && AI2Health <=0 && ItemDrop2==2 && missileCapacity<maxMissile) {
			mapPart46.paintIcon(this,g,AIx2+25,AIy2+21);
		}
		
		
		if (mapcount > 0 && mapcount < 12 && AI3Health >0) {
		mapPart81.paintIcon(this,g,EnemyPew[0].x, EnemyPew[0].y);
		}
		if(mapcount > 0 && mapcount < 12 && AI3Health <= 0 && ItemDrop3==1 && PlayerDamage != 0) {
			mapPart80.paintIcon(this,g,AIx3+16,AIy3+16);
		}
		if(mapcount > 0 && mapcount < 12 && AI3Health <=0 && ItemDrop3==2 && missileCapacity<maxMissile) {
			mapPart46.paintIcon(this,g,AIx3+25,AIy3+21);
		}
		
		
		if (mapcount > 0 && mapcount < 12 && AI4Health >0) {
		mapPart81.paintIcon(this,g,EnemyPew[0].x, EnemyPew[0].y);
		}
		if(mapcount > 0 && mapcount < 12 && AI4Health <= 0 && ItemDrop4==1 && PlayerDamage != 0) {
			mapPart80.paintIcon(this,g,AIx4+16,AIy4+16);
		}
		if(mapcount > 0 && mapcount < 12 && AI4Health <=0 && ItemDrop4==2 && missileCapacity<maxMissile) {
			mapPart46.paintIcon(this,g,AIx4+25,AIy4+21);
		}
		
		
		
		if (missileCollect) {
		mapPart40.paintIcon(this,g,895,30);
		g.setFont(new Font("Arial",Font.BOLD,30));
		g.setColor(new Color(255,255,255));
		g.drawString(""+missileCapacity,936,50);
		}	
		}
		if (PlayerHP <= PlayerDamage) {
			mapPart45.paintIcon(this,g,0,0);
			mapPart51.paintIcon(this,g,201,pointerY);
		}
		if (titlescreen == true) {
			mapPart82.paintIcon(this,g,0,0);
		}
		if (winScreen == true) {
			mapPart87.paintIcon(this,g,0,0);
			mapPart51.paintIcon(this,g,400,pointerY);
		}
	}
	
	public void collision() {
		Rectangle itemRoomFire1 = new Rectangle(288,384,64,64);
		Rectangle itemRoomFire2 = new Rectangle(672,384,64,64);
		Rectangle enviroPlayer = new Rectangle(charx,chary+50,38,14);
		Rectangle AI1ShotRange = new Rectangle(0,0,0,0);
		Rectangle AI1ItemDropped = new Rectangle(0,0,0,0);
		
		Rectangle AI2ShotRange = new Rectangle(0,0,0,0);
		Rectangle AI2ItemDropped = new Rectangle(0,0,0,0);
		
		Rectangle AI3ShotRange = new Rectangle(0,0,0,0);
		Rectangle AI3ItemDropped = new Rectangle(0,0,0,0);
		
		Rectangle AI4ShotRange = new Rectangle(0,0,0,0);
		Rectangle AI4ItemDropped = new Rectangle(0,0,0,0);
		
		Rectangle BossHitBox = new Rectangle(0,0,0,0);
		
		Rectangle Zora = new Rectangle (0,0,0,0);
		
		if (playerLook == 1 || playerLook == 5) {
			enviroPlayer = new Rectangle(charx,chary+50,36,14);	
		}else if(playerLook == 2 || playerLook == 6) {
			enviroPlayer = new Rectangle(charx,chary+50,36,14);	
		}else if(playerLook == 3 || playerLook == 7) {
			enviroPlayer = new Rectangle(charx,chary+50,36,14);	
		}else if(playerLook == 4 || playerLook == 8) {
			enviroPlayer = new Rectangle(charx,chary+50,36,14);	
		}
		
		
		Rectangle attackPlayer = new Rectangle(0,0,0,0);
		
		if (playerLook == 1 || playerLook == 5) {
			attackPlayer = new Rectangle(charx,chary,36,64);	
		}else if(playerLook == 2 || playerLook == 6) {
			attackPlayer = new Rectangle(charx,chary,36,64);	
		}else if(playerLook == 3 || playerLook == 7) {
			attackPlayer = new Rectangle(charx,chary,36,64);	
		}else if(playerLook == 4 || playerLook == 8) {
			attackPlayer = new Rectangle(charx,chary,36,64);	
		}
		
		Rectangle blastWall = new Rectangle (blastWallX,blastWallY,64,64);
		if (mapcount == 1) {
			blastWall = new Rectangle (blastWallX,blastWallY,64,64);
		}
		
		for(int row = 0; row < printmap.length; row++) {
			for(int col = 0; col < printmap[0].length; col++) {
				if (printmap[row][col] == 0 || printmap[row][col] == 3 || printmap[row][col] == 4 ||
						printmap[row][col] == 5 || printmap[row][col] == 6 || printmap[row][col] == 7 ||
						printmap[row][col] == 8 || printmap[row][col] == 9 || printmap[row][col] == 10 || 
						printmap[row][col] == 11 || printmap[row][col] == 12 || printmap[row][col] == 13 || 
						printmap[row][col] == 14 || printmap[row][col] == 16 || printmap[row][col] == 17 || 
						printmap[row][col] == 18 || printmap[row][col] == 19 || printmap[row][col] == 20 || 
						printmap[row][col] == 21 || printmap[row][col] == 22 || printmap[row][col] == 23) {
					Rectangle ItsAWall = new Rectangle(col*64,row*64,64,64);

					if (enviroPlayer.intersects(ItsAWall)) {
						if (VelX == 2 && cheating != 1) {
							charx = charx-4;
							cheating = 1;
						}else if(VelY == 2 && cheating != 1) {
							chary = chary-4;
							cheating = 1;

						}else if(VelX == -2 && cheating != 1) {
							charx = charx+4;
							cheating = 1;
						}else if(VelY == -2 && cheating != 1) {
							chary = chary+4;
							cheating = 1;
						}
						cheating = 0;
					}
				
					
				}else if(printmap[row][col] == 26 || printmap[row][col] == 28 || printmap[row][col] == 29 ||
						printmap[row][col] == 30 ||printmap[row][col] == 31 ||printmap[row][col] == 32 ||
						printmap[row][col] == 33 ||printmap[row][col] == 34 ||printmap[row][col] == 35 ||
						printmap[row][col] == 36 ||printmap[row][col] == 37 ||printmap[row][col] == 38) {
					Rectangle BossWall = new Rectangle(col*64,row*64+5,64,49);
					Rectangle PlatformBottom = new Rectangle(col*64+5,row*64+54,54,10);
					
					if (enviroPlayer.intersects(BossWall)) {
						if (VelX == 2 && cheating != 1) {
							charx = charx-4;
							cheating = 1;
						}else if(VelY == 2 && cheating != 1) {
							chary = chary-4;
							cheating = 1;

						}else if(VelX == -2 && cheating != 1) {
							charx = charx+4;
							cheating = 1;
						}else if(VelY == -2 && cheating != 1) {
							chary = chary+4;
							cheating = 1;
						}
						cheating = 0;
					}
					
					if (attackPlayer.intersects(PlatformBottom)) {
						VelY = 4;
					}
					
				}else if (printmap[row][col] == 2) {
					Rectangle itemRoomEnter = new Rectangle(col*64+20,row*64,24,54);
					if (enviroPlayer.intersects(itemRoomEnter)) {
						tempMapCount = mapcount;
						mapcount = 12;
						temp=1;
					}
				}else if (printmap[row][col] == 25) {
					Rectangle bossDoor = new Rectangle(col*64,row*64,64,64);
					if (enviroPlayer.intersects(bossDoor)) {
						mapcount = 13;
						VelY=0;
						playerLook=7;
						temp=1;		
					}
				}
					}
				}
		
		// item room fire collision
		if (mapcount == 12) {
			if (enviroPlayer.intersects(itemRoomFire1)) {
				
				if (VelX == 2 && cheating != 1) {

					charx = charx-4;
					cheating = 1;
				}else if(VelY == 2 && cheating != 1) {
					chary = chary-4;
					cheating = 1;

				}else if(VelX == -2 && cheating != 1) {
					charx = charx+4;
					cheating = 1;
				}else if(VelY == -2 && cheating != 1) {
					chary = chary+4;
					cheating = 1;
				}

				cheating = 0;
			}
			if (enviroPlayer.intersects(itemRoomFire2)) {
				
				if (VelX == 2 && cheating != 1) {
					charx = charx-4;
					cheating = 1;
				}else if(VelY == 2 && cheating != 1) {
					chary = chary-4;
					cheating = 1;

				}else if(VelX == -2 && cheating != 1) {
					charx = charx+4;
					cheating = 1;
				}else if(VelY == -2 && cheating != 1) {
					chary = chary+4;
					cheating = 1;
				}
				if (playerInvinc == false) {
					PlayerDamage++;
					PlayerDamageSize = new int [PlayerDamage];
					playerInvinc = true;
				}
					
					
				
				cheating = 0;
			}
			if (!blasterCollect) {
				if (tempMapCount == 0) { 
				Rectangle blasterItem = new Rectangle (493,384,38,64);
				if (enviroPlayer.intersects(blasterItem)) {
					JOptionPane.showMessageDialog(null, "Power beam acquired. Press spacebar to shoot a blast.");
					VelY = 0;
					VelX = 0;
					blasterCollect = true;
				}
				}
			}
			if (!missileCollect) {
				if (tempMapCount == 2) {
				Rectangle MissleItem = new Rectangle (493,384,38,64);
				if (enviroPlayer.intersects(MissleItem)) {
					JOptionPane.showMessageDialog(null, "Missle launcher acquired.\n Missiles are a more powerful projectile than the power beam.\n"
							+ "Press the 'z' key to toggle between the power beam and missiles.\nUse missiles sparingly as the power suit has a limited missle capacity.");
					VelY = 0;
					VelX = 0;
					missileCapacity = missileCapacity + 5;
					maxMissile = maxMissile+5;
					missileCollect = true;
				}
				}
			}
			
			//energy tank 1
			if (!eTank1) {
				if (tempMapCount == 1) {
				Rectangle ET1 = new Rectangle (480,384,64,64);
				if (enviroPlayer.intersects(ET1)) {
				PlayerHP++;
				healthBarSize = new int [PlayerHP];
				JOptionPane.showMessageDialog(null, "Energy tank acquired. Health capacity increased by 1. Energy has been fully restored.");
				VelY = 0;
				VelX = 0;
				eTank1 = true;
				PlayerDamage = 0;
			}
			}
			}
			
			//energy tank 2
			if (!eTank2) {
				if (tempMapCount == 3) {
					Rectangle ET2 = new Rectangle (480,384,64,64);
					if (enviroPlayer.intersects(ET2)) {
					PlayerHP++;
					healthBarSize = new int [PlayerHP];
					JOptionPane.showMessageDialog(null, "Energy tank acquired. Health capacity increased by 1. Energy has been fully restored.");
					VelY = 0;
					VelX = 0;
					eTank2 = true;
					PlayerDamage = 0;
			}
			}
			}
			
			//energy tank 3
			if (!eTank3) {
				if (tempMapCount == 4) {
					Rectangle ET3 = new Rectangle (480,384,64,64);
					if (enviroPlayer.intersects(ET3)) {
					PlayerHP++;
					healthBarSize = new int [PlayerHP];
					JOptionPane.showMessageDialog(null, "Energy tank acquired. Health capacity increased by 1. Energy has been fully restored.");
					VelY = 0;
					VelX = 0;
					eTank3 = true;
					PlayerDamage = 0;
			}
			}
			}
			
			//energy tank 4
			if (!eTank4) {
				if (tempMapCount == 5) {
					Rectangle ET4 = new Rectangle (480,384,64,64);
					if (enviroPlayer.intersects(ET4)) {
					PlayerHP++;
					healthBarSize = new int [PlayerHP];
					JOptionPane.showMessageDialog(null, "Energy tank acquired. Health capacity increased by 1. Energy has been fully restored.");
					VelY = 0;
					VelX = 0;
					eTank4 = true;
					PlayerDamage = 0;
			}
			}
			}
			
			//energy tank 5
			if (!eTank5) {
				if (tempMapCount == 9) {
					Rectangle ET5 = new Rectangle (480,384,64,64);
					if (enviroPlayer.intersects(ET5)) {
					PlayerHP++;
					healthBarSize = new int [PlayerHP];
					JOptionPane.showMessageDialog(null, "Energy tank acquired. Health capacity increased by 1. Energy has been fully restored.");
					VelY = 0;
					VelX = 0;
					eTank5 = true;
					PlayerDamage = 0;
			}
			}
			}
			
			//energy tank 6
			if (!eTank6) {
				if (tempMapCount == 7) {
					Rectangle ET6 = new Rectangle (480,384,64,64);
					if (enviroPlayer.intersects(ET6)) {
					PlayerHP++;
					healthBarSize = new int [PlayerHP];
					JOptionPane.showMessageDialog(null, "Energy tank acquired. Health capacity increased by 1. Energy has been fully restored.");
					VelY = 0;
					VelX = 0;
					eTank6 = true;
					PlayerDamage = 0;
			}
			}
			}
			
			//energy tank 7
			if (!eTank7) {
				if (tempMapCount == 11) {
					Rectangle ET7 = new Rectangle (480,384,64,64);
					if (enviroPlayer.intersects(ET7)) {
					PlayerHP++;
					healthBarSize = new int [PlayerHP];
					JOptionPane.showMessageDialog(null, "Energy tank acquired. Health capacity increased by 1. Energy has been fully restored.");
					VelY = 0;
					VelX = 0;
					eTank7 = true;
					PlayerDamage = 0;
			}
			}
			}
			
			//missile expansion 1
			if (!missleExpansion1) {
				if (tempMapCount == 10) {
					Rectangle MisEx1 = new Rectangle (480,384,64,64);
					if (enviroPlayer.intersects(MisEx1)) {
						JOptionPane.showMessageDialog(null, "Missile expansion acquired. Missile capacity increased by 5.");
						VelY = 0;
						VelX = 0;
						maxMissile = maxMissile+5;
						missileCapacity = missileCapacity + 5;
						missleExpansion1 = true;

			}
			}
			}
			
			//missile expansion 2
			if (!missleExpansion2) {
				if (tempMapCount == 6) {
					Rectangle MisEx2 = new Rectangle (480,384,64,64);
					if (enviroPlayer.intersects(MisEx2)) {
						JOptionPane.showMessageDialog(null, "Missile expansion acquired. Missile capacity increased by 5.");
						VelY = 0;
						VelX = 0;
						maxMissile = maxMissile+5;
						missileCapacity = missileCapacity + 5;
						missleExpansion2 = true;

			}
			}
			}
			
			//missile expansion 3
			if (!missleExpansion3) {
				if (tempMapCount == 8) {
					Rectangle MisEx3 = new Rectangle (480,384,64,64);
					if (enviroPlayer.intersects(MisEx3)) {
						JOptionPane.showMessageDialog(null, "Missile expansion acquired. Missile capacity increased by 5.");
						VelY = 0;
						VelX = 0;
						maxMissile = maxMissile+5;
						missileCapacity = missileCapacity + 5;
						missleExpansion3 = true;
						
			}
			}
		}
		}
		
		for (int i = 0; i < weaponblast.length; i++) {
			Rectangle blast = weaponblast[i].getBounds();
			if (blast.intersects(blastWall)) {
				printmap[blastWallY/64][blastWallX/64] = 2;
			}
		}
		if (AI1Health > 0 && mapcount > 0 && mapcount < 12 && AI1Health > 0) {
			Rectangle AIHitbox1 = new Rectangle (AIx1, AIy1, 64, 64);
			if (AIHitbox1.intersects(attackPlayer) && playerInvinc == false){
				PlayerDamage++;
				PlayerDamageSize = new int [PlayerDamage];
				playerInvinc = true;
			}
			for (int i = 0; i < weaponblast.length; i++) {
				Rectangle blast = weaponblast[i].getBounds();
				if (blast.intersects(AIHitbox1) && AI1Invinc == false && WeaponToggle%2 == 0) {
					AI1Health--;
					AI1Invinc = true;
				}
				if (blast.intersects(AIHitbox1) && AI1Invinc == false && WeaponToggle%2 != 0) {
					AI1Health = AI1Health-2;
					AI1Invinc = true;
				}
			}
			if (AI1Look == 1) {
				AI1ShotRange = new Rectangle(AIx1+20,AIy1+64,24,1024);
			}else if (AI1Look == 2) {
				AI1ShotRange = new Rectangle(AIx1+20,AIy1-1024,24,1024);
			}else if (AI1Look == 3) {
				AI1ShotRange = new Rectangle(AIx1+64,AIy1+20,1024,24);
			}else if (AI1Look == 4) {
				AI1ShotRange = new Rectangle(AIx1-1024,AIy1+20,1024,24);
			}
			
			if (attackPlayer.intersects(AI1ShotRange)) {
				AI1PewNum = 1;
				if (AI1Look == 1) {
					AI1PewVely = 5;
					AI1PewVelx = 0;
				}else if (AI1Look == 2) {
					AI1PewVely = -5;
					AI1PewVelx = 0;
				}else if (AI1Look == 3) {
					AI1PewVelx = 5;
					AI1PewVely = 0;
				}else if (AI1Look == 4) {
					AI1PewVelx = -5;
					AI1PewVely = 0;
				}

				AI1PewCount++;
				
			}
			
				for (int i = 0; i < EnemyPew.length; i++) {
					Rectangle AI1Pew = EnemyPew[i].EnemyGetBounds();
				if (AI1Pew.intersects(attackPlayer) && playerInvinc == false){
					PlayerDamage++;
					PlayerDamageSize = new int [PlayerDamage];
					playerInvinc = true;
				}
				}	

		}
		
		
		if (AI2Health > 0 && mapcount > 0 && mapcount < 12 && AI2Health > 0) {
			Rectangle AIHitbox2 = new Rectangle (AIx2, AIy2, 64, 64);
			if (AIHitbox2.intersects(attackPlayer) && playerInvinc == false){
				PlayerDamage++;
				PlayerDamageSize = new int [PlayerDamage];
				playerInvinc = true;
			}
			for (int i = 0; i < weaponblast.length; i++) {
				Rectangle blast = weaponblast[i].getBounds();
				if (blast.intersects(AIHitbox2) && AI2Invinc == false && WeaponToggle%2 == 0) {
					AI2Health--;
					AI2Invinc = true;
				}
				if (blast.intersects(AIHitbox2) && AI2Invinc == false && WeaponToggle%2 != 0) {
					AI2Health = AI2Health-2;
					AI2Invinc = true;
				}
			}
			if (AI2Look == 1) {
				AI2ShotRange = new Rectangle(AIx2+20,AIy2+64,24,1024);
			}else if (AI2Look == 2) {
				AI2ShotRange = new Rectangle(AIx2+20,AIy2-1024,24,1024);
			}else if (AI2Look == 3) {
				AI2ShotRange = new Rectangle(AIx2+64,AIy2+20,1024,24);
			}else if (AI2Look == 4) {
				AI2ShotRange = new Rectangle(AIx2-1024,AIy2+20,1024,24);
			}
			
			if (attackPlayer.intersects(AI2ShotRange)) {
				AI2PewNum = 1;
				if (AI2Look == 1) {
					AI2PewVely = 5;
					AI2PewVelx = 0;
				}else if (AI2Look == 2) {
					AI2PewVely = -5;
					AI2PewVelx = 0;
				}else if (AI2Look == 3) {
					AI2PewVelx = 5;
					AI2PewVely = 0;
				}else if (AI2Look == 4) {
					AI2PewVelx = -5;
					AI2PewVely = 0;
				}

				AI2PewCount++;
				
			}
			
				for (int i = 0; i < EnemyPew.length; i++) {
					Rectangle AI2Pew = EnemyPew[i].EnemyGetBounds();
				if (AI2Pew.intersects(attackPlayer) && playerInvinc == false){
					PlayerDamage++;
					PlayerDamageSize = new int [PlayerDamage];
					playerInvinc = true;
				}
				}	

		}
		
		
		if (AI3Health > 0 && mapcount > 0 && mapcount < 12 && AI3Health > 0) {
			Rectangle AIHitbox3 = new Rectangle (AIx3, AIy3, 64, 64);
			if (AIHitbox3.intersects(attackPlayer) && playerInvinc == false){
				PlayerDamage++;
				PlayerDamageSize = new int [PlayerDamage];
				playerInvinc = true;
			}
			for (int i = 0; i < weaponblast.length; i++) {
				Rectangle blast = weaponblast[i].getBounds();
				if (blast.intersects(AIHitbox3) && AI3Invinc == false && WeaponToggle%2 == 0) {
					AI3Health--;
					AI3Invinc = true;
				}
				if (blast.intersects(AIHitbox3) && AI3Invinc == false && WeaponToggle%2 != 0) {
					AI3Health = AI3Health-2;
					AI3Invinc = true;
				}
			}
			if (AI3Look == 1) {
				AI3ShotRange = new Rectangle(AIx3+20,AIy3+64,24,1024);
			}else if (AI3Look == 2) {
				AI3ShotRange = new Rectangle(AIx3+20,AIy3-1024,24,1024);
			}else if (AI3Look == 3) {
				AI3ShotRange = new Rectangle(AIx3+64,AIy3+20,1024,24);
			}else if (AI3Look == 4) {
				AI3ShotRange = new Rectangle(AIx3-1024,AIy3+20,1024,24);
			}
			
			if (attackPlayer.intersects(AI3ShotRange)) {
				AI3PewNum = 1;
				if (AI3Look == 1) {
					AI3PewVely = 5;
					AI3PewVelx = 0;
				}else if (AI3Look == 2) {
					AI3PewVely = -5;
					AI3PewVelx = 0;
				}else if (AI3Look == 3) {
					AI3PewVelx = 5;
					AI3PewVely = 0;
				}else if (AI3Look == 4) {
					AI3PewVelx = -5;
					AI3PewVely = 0;
				}

				AI3PewCount++;
				
			}
			
				for (int i = 0; i < EnemyPew.length; i++) {
					Rectangle AI3Pew = EnemyPew[i].EnemyGetBounds();
				if (AI3Pew.intersects(attackPlayer) && playerInvinc == false){
					PlayerDamage++;
					PlayerDamageSize = new int [PlayerDamage];
					playerInvinc = true;
				}
				}	

		}
		
		
		if (AI4Health > 0 && mapcount > 0 && mapcount < 12 && AI4Health > 0) {
			Rectangle AIHitbox4 = new Rectangle (AIx4, AIy4, 64, 64);
			if (AIHitbox4.intersects(attackPlayer) && playerInvinc == false){
				PlayerDamage++;
				PlayerDamageSize = new int [PlayerDamage];
				playerInvinc = true;
			}
			for (int i = 0; i < weaponblast.length; i++) {
				Rectangle blast = weaponblast[i].getBounds();
				if (blast.intersects(AIHitbox4) && AI4Invinc == false && WeaponToggle%2 == 0) {
					AI4Health--;
					AI4Invinc = true;
				}
				if (blast.intersects(AIHitbox4) && AI4Invinc == false && WeaponToggle%2 != 0) {
					AI4Health = AI4Health-2;
					AI4Invinc = true;
				}
			}
			if (AI4Look == 1) {
				AI4ShotRange = new Rectangle(AIx4+20,AIy4+64,24,1024);
			}else if (AI4Look == 2) {
				AI4ShotRange = new Rectangle(AIx4+20,AIy4-1024,24,1024);
			}else if (AI4Look == 3) {
				AI4ShotRange = new Rectangle(AIx4+64,AIy4+20,1024,24);
			}else if (AI4Look == 4) {
				AI4ShotRange = new Rectangle(AIx4-1024,AIy4+20,1024,24);
			}
			
			if (attackPlayer.intersects(AI4ShotRange)) {
				AI4PewNum = 1;
				if (AI4Look == 1) {
					AI4PewVely = 5;
					AI4PewVelx = 0;
				}else if (AI4Look == 2) {
					AI4PewVely = -5;
					AI4PewVelx = 0;
				}else if (AI4Look == 3) {
					AI4PewVelx = 5;
					AI4PewVely = 0;
				}else if (AI4Look == 4) {
					AI4PewVelx = -5;
					AI4PewVely = 0;
				}

				AI4PewCount++;
				
			}
			
				for (int i = 0; i < EnemyPew.length; i++) {
					Rectangle AI4Pew = EnemyPew[i].EnemyGetBounds();
				if (AI4Pew.intersects(attackPlayer) && playerInvinc == false){
					PlayerDamage++;
					PlayerDamageSize = new int [PlayerDamage];
					playerInvinc = true;
				}
				}	

		}
		
			if(mapcount > 0 && mapcount < 12 && AI1Health <= 0 && ItemDrop1==1 && PlayerDamage!=0) {
				AI1ItemDropped = new Rectangle(AIx1+32,AIy1+32,16,16);
			}
			if(mapcount > 0 && mapcount < 12 && AI1Health <= 0 && ItemDrop1==2 && missileCapacity<maxMissile) {
				AI1ItemDropped = new Rectangle(AIx1+25,AIy1+21,13,21);
			}
			if(attackPlayer.intersects(AI1ItemDropped)) {
				if (ItemDrop1==1) {
					PlayerDamage--;
					PlayerDamageSize = new int [PlayerDamage];
					ItemDrop1=0;
					ItemDropCollect1 = true;
				}
				if(ItemDrop1==2) {
					missileCapacity = missileCapacity + 5;
					ItemDrop1=0;
					ItemDropCollect1 = true;
					while (missileCapacity > maxMissile) {
						missileCapacity--;
					}
				}
			}
			
			
			if(mapcount > 0 && mapcount < 12 && AI2Health <= 0 && ItemDrop2==1 && PlayerDamage!=0) {
				AI2ItemDropped = new Rectangle(AIx2+32,AIy2+32,16,16);
			}
			if(mapcount > 0 && mapcount < 12 && AI2Health <= 0 && ItemDrop2==2 && missileCapacity<maxMissile) {
				AI2ItemDropped = new Rectangle(AIx2+25,AIy2+21,13,21);
			}
			if(attackPlayer.intersects(AI2ItemDropped)) {
				if (ItemDrop2==1) {
					PlayerDamage--;
					PlayerDamageSize = new int [PlayerDamage];
					ItemDrop2=0;
					ItemDropCollect2 = true;
				}
				if(ItemDrop2==2) {
					missileCapacity = missileCapacity + 5;
					ItemDrop2=0;
					ItemDropCollect2 = true;
					while (missileCapacity > maxMissile) {
						missileCapacity--;
					}
				}
			}
			
			
			if(mapcount > 0 && mapcount < 12 && AI3Health <= 0 && ItemDrop3==1 && PlayerDamage!=0) {
				AI3ItemDropped = new Rectangle(AIx3+32,AIy3+32,16,16);
			}
			if(mapcount > 0 && mapcount < 12 && AI3Health <= 0 && ItemDrop3==2 && missileCapacity<maxMissile) {
				AI3ItemDropped = new Rectangle(AIx3+25,AIy3+21,13,21);
			}
			if(attackPlayer.intersects(AI3ItemDropped)) {
				if (ItemDrop3==1) {
					PlayerDamage--;
					PlayerDamageSize = new int [PlayerDamage];
					ItemDrop3=0;
					ItemDropCollect3 = true;
				}
				if(ItemDrop3==2) {
					missileCapacity = missileCapacity + 5;
					ItemDrop3=0;
					ItemDropCollect3 = true;
					while (missileCapacity > maxMissile) {
						missileCapacity--;
					}
				}
			}
			
			
			if(mapcount > 0 && mapcount < 12 && AI4Health <= 0 && ItemDrop4==1 && PlayerDamage!=0) {
				AI4ItemDropped = new Rectangle(AIx4+32,AIy4+32,16,16);
			}
			if(mapcount > 0 && mapcount < 12 && AI4Health <= 0 && ItemDrop4==2 && missileCapacity<maxMissile) {
				AI4ItemDropped = new Rectangle(AIx4+25,AIy4+21,13,21);
			}
			if(attackPlayer.intersects(AI4ItemDropped)) {
				if (ItemDrop4==1) {
					PlayerDamage--;
					PlayerDamageSize = new int [PlayerDamage];
					ItemDrop4=0;
					ItemDropCollect4 = true;
				}
				if(ItemDrop4==2) {
					missileCapacity = missileCapacity + 5;
					ItemDrop4=0;
					ItemDropCollect4 = true;
					while (missileCapacity > maxMissile) {
						missileCapacity--;
					}
				}
			}
			
			if (mapcount==14) {
				Rectangle bossGlass = new Rectangle (256,320,64,128);
				for (int i = 0; i < weaponblast.length; i++) {
					Rectangle blast = weaponblast[i].getBounds();
					if (blast.intersects(bossGlass)) {
						glassBreak=true;
						map15[4][1] = 41;
					}
					if (glassBreak==true) {
						BossHitBox = new Rectangle(128,320,192,128);
					}
					if (blast.intersects(BossHitBox) && bossInvinc == false && WeaponToggle%2 == 0) {
						bossHealth--;
						bossInvinc = true;
					}
					if (blast.intersects(BossHitBox) && bossInvinc == false && WeaponToggle%2 != 0) {
						bossHealth = bossHealth-2;
						bossInvinc = true;
					}

				}
				if(bossHealth>0) {
						Rectangle RinkaPew = SpecialPew.BossPewCollision();
					if (RinkaPew.intersects(attackPlayer) && playerInvinc == false){
						PlayerDamage++;
						PlayerDamageSize = new int [PlayerDamage];
						playerInvinc = true;
					}
					}
				}

			if (mapcount==3 && AI5Health>0 ||mapcount==4 && AI5Health>0) {
				Rectangle ZoraSpit = SpecialPew.BossPewCollision();
			if (ZoraSpit.intersects(attackPlayer) && playerInvinc == false){
				PlayerDamage++;
				PlayerDamageSize = new int [PlayerDamage];
				playerInvinc = true;
			}
			Zora = new Rectangle (AI5x,AI5y,64,64);
			for (int i = 0; i < weaponblast.length; i++) {
				Rectangle blast = weaponblast[i].getBounds();
			if (blast.intersects(Zora)&&AI5Invis==false){
				AI5Health=AI5Health-1;
			}
			}
			}

	}
		
	
	public static void main(String[] args) {

		GameMap d = new GameMap();
		JFrame window = new JFrame();
		window.setTitle("The Legend of Metroid");
		window.setSize(1024,871);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(d);	
	}	
	}
