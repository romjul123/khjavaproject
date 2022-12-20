package com.kh.practice.music.run;

import java.util.List;

import com.kh.practice.music.controller.MusicController;
import com.kh.practice.music.model.vo.Music;
import com.kh.practice.music.view.MusicView;

public class Run {
	public static void main(String [] args) {
		MusicView view = new MusicView();
		MusicController mCon = new MusicController();
		int select = 0;
		String title = "";
		int index = 0;
		Music music = null;
		do {
			select = view.musicMenu();
			switch(select) {
			case 1 : 
				music = view.inputMusicInfo("������");
				mCon.addAtLast(music);
				view.displayScuccess("�߰� ����!");
				break;
			case 2 : 
				music = view.inputMusicInfo("ù");
				mCon.addAtZero(music);
				view.displayScuccess("�߰� ����!");
				break;
			case 3 : 
				List<Music> allList = mCon.printMusicList();
				view.showAllMusicList(allList);
				view.displayScuccess("��ȸ ����!");
				break;
			case 4 : 
				title = view.inputMusicName("�˻�");
				List<Music> findList = mCon.searchMusicsByName(title);
				view.showAllMusicList(findList);
				view.displayScuccess("��ȸ ����!");
//				index = mCon.searchOneByName(title);
//				music = mCon.selectOneByIndex(index);
				view.showOneMusic(music);
				break;
			case 5 : 
				title = view.inputMusicName("����");
				index = mCon.searchOneByName(title);
				if(index == -1) {
					view.displayError("�������� �ʽ��ϴ�.");
					break;
				}
				mCon.removeMusic(index);
				view.displayScuccess("���� ����!");
				break;
			case 6 : 
				// �̸� �ޱ�
				title = view.inputMusicName("����");
				// �̸����� �ε��� �˻�
				index = mCon.searchOneByName(title);
				if(index == -1) {
					view.displayError("��ȸ ����!");
					break;
				}
				// ������ ������ ����
				music = view.modifyMusicInfo();
				// ����ҿ� �����ϱ�
				mCon.updateMusic(index, music);
				break;
			case 7 : 
//				System.out.println("��� �������� ����");
				view.printMessage("=== === ��� �������� ���� === ===");
				mCon.sortByTitleASC();
				view.printMessage("���� ����! 3���� ���� ������ּ���.");
				break;
			case 8 : 
				view.printMessage("=== === ��� �������� ���� === ===");
				mCon.sortByTitleDESC();
				view.printMessage("���� ����! 3���� ���� ������ּ���.");
				break;
			case 9 : 
				view.printMessage("=== === ������ �������� ���� === ===");
				mCon.sortBySingerASC();
				view.printMessage("���� ����! 3���� ���� ������ּ���.");
				break;
			case 10 : 
				view.printMessage("=== === ������ �������� ���� === ===");
				mCon.sortBySingerDESC();
				view.printMessage("���� ����! 3���� ���� ������ּ���.");
				break;
			}
		}while(select != 0);
	}

}
