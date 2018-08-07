package com.luo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataCache {
	
	public static List<List<String>> cache = new ArrayList<List<String>>();
	public static List<String> heads = new ArrayList<String>();
	
	static {
	
		String[] head1 = {"コード","名","参加ルールラベル","分類ラベル","掲載パターン：A","サムネイル画像パス：A","掲載パターン：B","サムネイル画像パス：B","掲載パターン：C","サムネイル画像パス：C","遷移先URL","公開状況","公開開始日時","公開終了日時","イベント開始日時","イベント終了日時","開催場所","タグ01","タグ02","タグ03","タグ04","タグ05","関連システムフラグ","一覧：説明(1行目)","一覧：説明(2行目)","一覧：説明(3行目)","一押し","CRM申込状況管理有効フラグ","キャッチコピー","申込可能フラグ"};
		String[] head2 = {"Code","Name","RuleLabel","ClassificationLabel","IsEnableA","ThumbnailPathA","IsEnableB","ThumbnailPathB","IsEnableC","ThumbnailPathC","DestinationUrl","ReleaseStatus","ReleaseStartDateTime","ReleaseEndDateTime","EventStartDateTime","EventEndDateTime","Venue","Tag01","Tag02","Tag03","Tag04","Tag05","RelatedSystemFlag","ContentListDescription1","ContentListDescription2","ContentListDescription3","Recommend","CrmApplicationIsActive","CatchCopy","ApplicablePossibleFlag"};
		heads.addAll(Arrays.asList(head2));
		
		String[] array1 = {"AE","ae0001","A０００１","参加ルールラベル A０００１","01","TRUE","AE0001.jpg","FALSE","","FALSE","","https://www.AE001.com","True","1531065600000","1562601638000","1531065600000","1562601638000","01","サッカー","カヌー","ゴルフ","体操","ハンドボール","FALSE","AE0001  1行目XXXXXXXX","AE0001  2行目XXXXXXXX","AE0001  3行目XXXXXXXX","TRUE","FALSE"," A０００１   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array2 = {"AE","ae0002","A０００２","参加ルールラベル A０００２","02","TRUE","AE0002.jpg","FALSE","","FALSE","","https://www.AE002.com","True","1531065601000","1562601637000","1531065601000","1562601637000","01","サッカー","カヌー","ゴルフ","体操","","TRUE","AE0002  1行目XXXXXXXX","AE0002  2行目XXXXXXXX","AE0002  3行目XXXXXXXX","TRUE","FALSE"," A０００２   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array3 = {"AE","ae0003","A０００３","参加ルールラベル A０００３","03","TRUE","AE0003.jpg","FALSE","","FALSE","","https://www.AE003.com","True","1531065602000","1562601636000","1531065602000","1562601636000","01","サッカー","カヌー","ゴルフ","","","FALSE","AE0003  1行目XXXXXXXX","AE0003  2行目XXXXXXXX","AE0003  3行目XXXXXXXX","TRUE","FALSE"," A０００３   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array4 = {"AE","ae0004","A０００４","参加ルールラベル A０００４","04","TRUE","AE0004.jpg","FALSE","","FALSE","","https://www.AE004.com","True","1531065603000","1562601635000","1531065603000","1562601635000","01","サッカー","カヌー","","","","FALSE","AE0004  1行目XXXXXXXX","AE0004  2行目XXXXXXXX","AE0004  3行目XXXXXXXX","TRUE","FALSE"," A０００４   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array5 = {"AE","ae0005","A０００５","参加ルールラベル A０００５","05","TRUE","AE0005.jpg","FALSE","","FALSE","","https://www.AE005.com","True","1531065604000","1562601634000","1531065604000","1562601634000","01","サッカー","","","","","FALSE","AE0005  1行目XXXXXXXX","AE0005  2行目XXXXXXXX","AE0005  3行目XXXXXXXX","TRUE","FALSE"," A０００５   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array6 = {"AE","ae0006","A０００６","参加ルールラベル A０００６","06","TRUE","AE0006.jpg","FALSE","","FALSE","","https://www.AE006.com","True","1531065605000","1562601633000","1531065605000","1562601633000","01","サッカー","カヌー","ゴルフ","体操","ハンドボール","FALSE","AE0006  1行目XXXXXXXX","AE0006  2行目XXXXXXXX","AE0006  3行目XXXXXXXX","TRUE","FALSE"," A０００６   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array7 = {"AE","ae0007","A０００７","参加ルールラベル A０００７","07","TRUE","AE0007.jpg","FALSE","","FALSE","","https://www.AE007.com","True","1531065606000","1562601632000","1531065606000","1562601632000","01","サッカー","カヌー","ゴルフ","体操","","FALSE","AE0007  1行目XXXXXXXX","AE0007  2行目XXXXXXXX","AE0007  3行目XXXXXXXX","TRUE","FALSE"," A０００７   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array8 = {"AE","ae0008","A０００８","参加ルールラベル A０００８","08","TRUE","AE0008.jpg","FALSE","","FALSE","","https://www.AE008.com","True","1531065607000","1562601631000","1531065607000","1562601631000","01","サッカー","カヌー","ゴルフ","","","FALSE","AE0008  1行目XXXXXXXX","AE0008  2行目XXXXXXXX","AE0008  3行目XXXXXXXX","TRUE","FALSE"," A０００８   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array9 = {"AE","ae0009","A０００９","参加ルールラベル A０００９","09","TRUE","AE0009.jpg","FALSE","","FALSE","","https://www.AE009.com","True","1531065608000","1562601630000","1531065608000","1562601630000","01","サッカー","カヌー","","","","FALSE","AE0009  1行目XXXXXXXX","AE0009  2行目XXXXXXXX","AE0009  3行目XXXXXXXX","TRUE","FALSE"," A０００９   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array10 = {"AE","ae0010","A００１０","参加ルールラベル A００１０","10","TRUE","AE0010.jpg","FALSE","","FALSE","","https://www.AE010.com","True","1531065609000","1562601629000","1531065609000","1562601629000","01","サッカー","","","","","FALSE","AE0010  1行目XXXXXXXX","AE0010  2行目XXXXXXXX","AE0010  3行目XXXXXXXX","TRUE","FALSE"," A００１０   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array11 = {"AE","ae0011","A００１１","参加ルールラベル A００１１","11","TRUE","AE0011.jpg","FALSE","","FALSE","","https://www.AE011.com","True","1531065610000","1562601628000","1531065610000","1562601628000","01","サッカー","カヌー","ゴルフ","体操","ハンドボール","FALSE","AE0011  1行目XXXXXXXX","AE0011  2行目XXXXXXXX","AE0011  3行目XXXXXXXX","TRUE","FALSE"," A００１１   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array12 = {"AE","ae0012","A００１２","参加ルールラベル A００１２","12","TRUE","AE0012.jpg","FALSE","","FALSE","","https://www.AE012.com","True","1531065611000","1562601627000","1531065611000","1562601627000","01","サッカー","カヌー","ゴルフ","体操","","FALSE","AE0012  1行目XXXXXXXX","AE0012  2行目XXXXXXXX","AE0012  3行目XXXXXXXX","TRUE","FALSE"," A００１２   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array13 = {"AE","ae0013","A００１３","参加ルールラベル A００１３","13","TRUE","AE0013.jpg","FALSE","","FALSE","","https://www.AE013.com","True","1531065612000","1562601626000","1531065612000","1562601626000","01","サッカー","カヌー","ゴルフ","","","FALSE","AE0013  1行目XXXXXXXX","AE0013  2行目XXXXXXXX","AE0013  3行目XXXXXXXX","TRUE","FALSE"," A００１３   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array14 = {"AC","ac0001","A０００１","参加ルールラベル A０００１","01","TRUE","AC0001.jpg","FALSE","","FALSE","","https://www.AC001.com","True","1531065613000","1562601625000","1531065613000","1562601625000","01","サッカー","カヌー","","","","FALSE","AC0001  1行目XXXXXXXX","AC0001  2行目XXXXXXXX","AC0001  3行目XXXXXXXX","TRUE","FALSE"," A０００１   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array15 = {"AC","ac0002","A０００２","参加ルールラベル A０００２","02","TRUE","AC0002.jpg","FALSE","","FALSE","","https://www.AC002.com","True","1531065614000","1562601624000","1531065614000","1562601624000","01","サッカー","","","","","FALSE","AC0002  1行目XXXXXXXX","AC0002  2行目XXXXXXXX","AC0002  3行目XXXXXXXX","TRUE","FALSE"," A０００２   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array16 = {"AC","ac0003","A０００３","参加ルールラベル A０００３","03","TRUE","AC0003.jpg","FALSE","","FALSE","","https://www.AC003.com","True","1531065615000","1562601623000","1531065615000","1562601623000","01","サッカー","カヌー","ゴルフ","体操","ハンドボール","FALSE","AC0003  1行目XXXXXXXX","AC0003  2行目XXXXXXXX","AC0003  3行目XXXXXXXX","TRUE","FALSE"," A０００３   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array17 = {"AC","ac0004","A０００４","参加ルールラベル A０００４","04","TRUE","AC0004.jpg","FALSE","","FALSE","","https://www.AC004.com","True","1531065616000","1562601622000","1531065616000","1562601622000","01","サッカー","カヌー","ゴルフ","体操","","FALSE","AC0004  1行目XXXXXXXX","AC0004  2行目XXXXXXXX","AC0004  3行目XXXXXXXX","TRUE","FALSE"," A０００４   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array18 = {"AC","ac0005","A０００５","参加ルールラベル A０００５","05","TRUE","AC0005.jpg","FALSE","","FALSE","","https://www.AC005.com","True","1531065617000","1562601621000","1531065617000","1562601621000","01","サッカー","カヌー","ゴルフ","","","FALSE","AC0005  1行目XXXXXXXX","AC0005  2行目XXXXXXXX","AC0005  3行目XXXXXXXX","TRUE","FALSE"," A０００５   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array19 = {"AC","ac0006","A０００６","参加ルールラベル A０００６","06","TRUE","AC0006.jpg","FALSE","","FALSE","","https://www.AC006.com","True","1531065618000","1562601620000","1531065618000","1562601620000","01","サッカー","カヌー","","","","FALSE","AC0006  1行目XXXXXXXX","AC0006  2行目XXXXXXXX","AC0006  3行目XXXXXXXX","TRUE","FALSE"," A０００６   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array20 = {"AC","ac0007","A０００７","参加ルールラベル A０００７","07","TRUE","AC0007.jpg","FALSE","","FALSE","","https://www.AC007.com","True","1531065619000","1562601619000","1531065619000","1562601619000","01","サッカー","","","","","FALSE","AC0007  1行目XXXXXXXX","AC0007  2行目XXXXXXXX","AC0007  3行目XXXXXXXX","TRUE","FALSE"," A０００７   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array21 = {"AC","ac0008","A０００８","参加ルールラベル A０００８","08","TRUE","AC0008.jpg","FALSE","","FALSE","","https://www.AC008.com","True","1531065620000","1562601618000","1531065620000","1562601618000","01","サッカー","カヌー","ゴルフ","体操","ハンドボール","FALSE","AC0008  1行目XXXXXXXX","AC0008  2行目XXXXXXXX","AC0008  3行目XXXXXXXX","TRUE","FALSE"," A０００８   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array22 = {"AC","ac0009","A０００９","参加ルールラベル A０００９","09","TRUE","AC0009.jpg","FALSE","","FALSE","","https://www.AC009.com","True","1531065621000","1562601617000","1531065621000","1562601617000","01","サッカー","カヌー","ゴルフ","体操","","FALSE","AC0009  1行目XXXXXXXX","AC0009  2行目XXXXXXXX","AC0009  3行目XXXXXXXX","TRUE","FALSE"," A０００９   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array23 = {"AC","ac0010","A００１０","参加ルールラベル A００１０","10","TRUE","AC0010.jpg","FALSE","","FALSE","","https://www.AC010.com","True","1531065622000","1562601616000","1531065622000","1562601616000","01","サッカー","カヌー","ゴルフ","","","FALSE","AC0010  1行目XXXXXXXX","AC0010  2行目XXXXXXXX","AC0010  3行目XXXXXXXX","TRUE","FALSE"," A００１０   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array24 = {"AC","ac0011","A００１１","参加ルールラベル A００１１","11","TRUE","AC0011.jpg","FALSE","","FALSE","","https://www.AC011.com","True","1531065623000","1562601615000","1531065623000","1562601615000","01","サッカー","カヌー","","","","FALSE","AC0011  1行目XXXXXXXX","AC0011  2行目XXXXXXXX","AC0011  3行目XXXXXXXX","TRUE","FALSE"," A００１１   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array25 = {"AC","ac0012","A００１２","参加ルールラベル A００１２","12","TRUE","AC0012.jpg","FALSE","","FALSE","","https://www.AC012.com","True","1531065624000","1562601614000","1531065624000","1562601614000","01","サッカー","","","","","FALSE","AC0012  1行目XXXXXXXX","AC0012  2行目XXXXXXXX","AC0012  3行目XXXXXXXX","TRUE","FALSE"," A００１２   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array26 = {"AC","ac0013","A００１３","参加ルールラベル A００１３","13","TRUE","AC0013.jpg","FALSE","","FALSE","","https://www.AC013.com","True","1531065625000","1562601613000","1531065625000","1562601613000","01","サッカー","カヌー","ゴルフ","体操","ハンドボール","FALSE","AC0013  1行目XXXXXXXX","AC0013  2行目XXXXXXXX","AC0013  3行目XXXXXXXX","TRUE","FALSE"," A００１３   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array27 = {"AN","an0001","A０００１","参加ルールラベル A０００１","01","TRUE","AN0001.jpg","FALSE","","FALSE","","https://www.AN001.com","True","1531065626000","1562601612000","1531065626000","1562601612000","01","サッカー","カヌー","ゴルフ","体操","","FALSE","AN0001  1行目XXXXXXXX","AN0001  2行目XXXXXXXX","AN0001  3行目XXXXXXXX","TRUE","FALSE"," A０００１   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array28 = {"AN","an0002","A０００２","参加ルールラベル A０００２","02","TRUE","AN0002.jpg","FALSE","","FALSE","","https://www.AN002.com","True","1531065627000","1562601611000","1531065627000","1562601611000","01","サッカー","カヌー","ゴルフ","","","FALSE","AN0002  1行目XXXXXXXX","AN0002  2行目XXXXXXXX","AN0002  3行目XXXXXXXX","TRUE","FALSE"," A０００２   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array29 = {"AN","an0003","A０００３","参加ルールラベル A０００３","03","TRUE","AN0003.jpg","FALSE","","FALSE","","https://www.AN003.com","True","1531065628000","1562601610000","1531065628000","1562601610000","01","サッカー","カヌー","","","","FALSE","AN0003  1行目XXXXXXXX","AN0003  2行目XXXXXXXX","AN0003  3行目XXXXXXXX","TRUE","FALSE"," A０００３   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array30 = {"AN","an0004","A０００４","参加ルールラベル A０００４","04","TRUE","AN0004.jpg","FALSE","","FALSE","","https://www.AN004.com","True","1531065629000","1562601609000","1531065629000","1562601609000","01","サッカー","","","","","FALSE","AN0004  1行目XXXXXXXX","AN0004  2行目XXXXXXXX","AN0004  3行目XXXXXXXX","TRUE","FALSE"," A０００４   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array31 = {"AN","an0005","A０００５","参加ルールラベル A０００５","05","TRUE","AN0005.jpg","FALSE","","FALSE","","https://www.AN005.com","True","1531065630000","1562601608000","1531065630000","1562601608000","01","サッカー","カヌー","ゴルフ","体操","ハンドボール","FALSE","AN0005  1行目XXXXXXXX","AN0005  2行目XXXXXXXX","AN0005  3行目XXXXXXXX","TRUE","FALSE"," A０００５   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array32 = {"AN","an0006","A０００６","参加ルールラベル A０００６","06","TRUE","AN0006.jpg","FALSE","","FALSE","","https://www.AN006.com","True","1531065631000","1562601607000","1531065631000","1562601607000","01","サッカー","カヌー","ゴルフ","体操","","FALSE","AN0006  1行目XXXXXXXX","AN0006  2行目XXXXXXXX","AN0006  3行目XXXXXXXX","TRUE","FALSE"," A０００６   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array33 = {"AN","an0007","A０００７","参加ルールラベル A０００７","07","TRUE","AN0007.jpg","FALSE","","FALSE","","https://www.AN007.com","True","1531065632000","1562601606000","1531065632000","1562601606000","01","サッカー","カヌー","ゴルフ","","","FALSE","AN0007  1行目XXXXXXXX","AN0007  2行目XXXXXXXX","AN0007  3行目XXXXXXXX","TRUE","FALSE"," A０００７   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array34 = {"AN","an0008","A０００８","参加ルールラベル A０００８","08","TRUE","AN0008.jpg","FALSE","","FALSE","","https://www.AN008.com","True","1531065633000","1562601605000","1531065633000","1562601605000","01","サッカー","カヌー","","","","FALSE","AN0008  1行目XXXXXXXX","AN0008  2行目XXXXXXXX","AN0008  3行目XXXXXXXX","TRUE","FALSE"," A０００８   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array35 = {"AN","an0009","A０００９","参加ルールラベル A０００９","09","TRUE","AN0009.jpg","FALSE","","FALSE","","https://www.AN009.com","True","1531065634000","1562601604000","1531065634000","1562601604000","01","サッカー","","","","","FALSE","AN0009  1行目XXXXXXXX","AN0009  2行目XXXXXXXX","AN0009  3行目XXXXXXXX","TRUE","FALSE"," A０００９   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array36 = {"AN","an0010","A００１０","参加ルールラベル A００１０","10","TRUE","AN0010.jpg","FALSE","","FALSE","","https://www.AN010.com","True","1531065635000","1562601603000","1531065635000","1562601603000","01","サッカー","カヌー","ゴルフ","体操","ハンドボール","FALSE","AN0010  1行目XXXXXXXX","AN0010  2行目XXXXXXXX","AN0010  3行目XXXXXXXX","TRUE","FALSE"," A００１０   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array37 = {"AN","an0011","A００１１","参加ルールラベル A００１１","11","TRUE","AN0011.jpg","FALSE","","FALSE","","https://www.AN011.com","True","1531065636000","1562601602000","1531065636000","1562601602000","01","サッカー","カヌー","ゴルフ","体操","","FALSE","AN0011  1行目XXXXXXXX","AN0011  2行目XXXXXXXX","AN0011  3行目XXXXXXXX","TRUE","FALSE"," A００１１   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array38 = {"AN","an0012","A００１２","参加ルールラベル A００１２","12","TRUE","AN0012.jpg","FALSE","","FALSE","","https://www.AN012.com","True","1531065637000","1562601601000","1531065637000","1562601601000","","サッカー","カヌー","ゴルフ","","","FALSE","AN0012  1行目XXXXXXXX","AN0012  2行目XXXXXXXX","AN0012  3行目XXXXXXXX","TRUE","FALSE"," A００１２   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","TRUE"};
		String[] array39 = {"AN","an0013","A００１３","参加ルールラベル A００１３","13","TRUE","AN0013.jpg","FALSE","","FALSE","","https://www.AN013.com","True","1531065638000","1562601600000","1531065638000","1562601600000","","サッカー","カヌー","","","","FALSE","AN0013  1行目XXXXXXXX","AN0013  2行目XXXXXXXX","AN0013  3行目XXXXXXXX","TRUE","FALSE"," A００１３   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array40 = {"AE","ae0014","A００１４","参加ルールラベル A００１４","03","TRUE","AN0014.jpg","FALSE","","FALSE","","https://www.AN014.com","True","1531065628000","1562601610000","1531065628000","1562601610000","01","騎馬戦","綱引き","","","","FALSE","AN0014  1行目XXXXXXXX","AN0003  2行目XXXXXXXX","AN0003  3行目XXXXXXXX","TRUE","FALSE"," A０００３   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array41 = {"AE","ae0015","A００１５","参加ルールラベル A００１５","03","TRUE","AN0015.jpg","FALSE","","FALSE","","https://www.AN015.com","True","1531065628000","1562601610000","1531065628000","1562601610000","01","騎馬戦","綱引き","玉入れ","","","FALSE","AN0015  1行目XXXXXXXX","AN0003  2行目XXXXXXXX","AN0003  3行目XXXXXXXX","TRUE","FALSE"," A０００３   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};
		String[] array42 = {"AE","ae0016","A００１６","参加ルールラベル A００１６","03","TRUE","AN0016.jpg","FALSE","","FALSE","","https://www.AN016.com","True","1531065628000","1562601610000","1531065628000","1562601610000","01","騎馬戦","綱引き","玉入れ","棒倒し","","FALSE","AN0016  1行目XXXXXXXX","AN0003  2行目XXXXXXXX","AN0003  3行目XXXXXXXX","TRUE","FALSE"," A０００３   キャッチコピー キャッチコピー キャッチコピー キャッチコピー キャッチコピー","FALSE"};


		cache.add(Arrays.asList(array1));
		cache.add(Arrays.asList(array2));
		cache.add(Arrays.asList(array3));
		cache.add(Arrays.asList(array4));
		cache.add(Arrays.asList(array5));
		cache.add(Arrays.asList(array6));
		cache.add(Arrays.asList(array7));
		cache.add(Arrays.asList(array8));
		cache.add(Arrays.asList(array9));
		cache.add(Arrays.asList(array10));
		cache.add(Arrays.asList(array11));
		cache.add(Arrays.asList(array12));
		cache.add(Arrays.asList(array13));
		cache.add(Arrays.asList(array14));
		cache.add(Arrays.asList(array15));
		cache.add(Arrays.asList(array16));
		cache.add(Arrays.asList(array17));
		cache.add(Arrays.asList(array18));
		cache.add(Arrays.asList(array19));
		cache.add(Arrays.asList(array20));
		cache.add(Arrays.asList(array21));
		cache.add(Arrays.asList(array22));
		cache.add(Arrays.asList(array23));
		cache.add(Arrays.asList(array24));
		cache.add(Arrays.asList(array25));
		cache.add(Arrays.asList(array26));
		cache.add(Arrays.asList(array27));
		cache.add(Arrays.asList(array28));
		cache.add(Arrays.asList(array29));
		cache.add(Arrays.asList(array30));
		cache.add(Arrays.asList(array31));
		cache.add(Arrays.asList(array32));
		cache.add(Arrays.asList(array33));
		cache.add(Arrays.asList(array34));
		cache.add(Arrays.asList(array35));
		cache.add(Arrays.asList(array36));
		cache.add(Arrays.asList(array37));
		cache.add(Arrays.asList(array38));
		cache.add(Arrays.asList(array39));
		cache.add(Arrays.asList(array40));
		cache.add(Arrays.asList(array41));
		cache.add(Arrays.asList(array42));
	}
	
	public String path = null;
	private static DataCache ins = null;
	
	private DataCache(String path) {
		this.path = path;
	}
	
	public static DataCache getInstance(String path) {
		if (ins == null) {
			ins = new DataCache(path);
		}
		return ins;
	}
	
	public List<List<String>> getLists(String lang, String kind) {
		List<List<String>> ret = new ArrayList<List<String>>();
		for(List<String> arr : cache) {
			if (arr.get(0) == kind) {
				List<String> item = new ArrayList<String>();
				for(int i=1;i<arr.size();i++) {
					item.add(arr.get(i));
				}
				// 参加ルールラベル
				item.set(2, lang + "_" + item.get(2));
				// キャッチコピー
				item.set(28, lang + "_" + item.get(28));
				// 画像
				item.set(5, path + "/img/" + lang + "_" + item.get(5));
				// ラベル
				item.set(1, getLabel(lang, kind) + "_" + item.get(1));
				
				// tag1
				if (item.get(17).length() != 0) {
					item.set(17, lang + "_" + item.get(17));
				}
				if (item.get(18).length() != 0) {
					item.set(18, lang + "_" + item.get(18));
				}
				if (item.get(19).length() != 0) {
					item.set(19, lang + "_" + item.get(19));
				}
				if (item.get(20).length() != 0) {
					item.set(20, lang + "_" + item.get(20));
				}
				if (item.get(21).length() != 0) {
					item.set(21, lang + "_" + item.get(21));
				}
				
				ret.add(item);
			}
		}
		return ret;
	}
	
	public List<List<String>> getLists(String lang) {
		List<List<String>> ret = new ArrayList<List<String>>();
		for(List<String> arr : cache) {

			List<String> item = new ArrayList<String>();
			for(int i=1;i<arr.size();i++) {
				item.add(arr.get(i));
			}
			// 参加ルールラベル
			item.set(2, lang + "_" + item.get(2));
			// キャッチコピー
			item.set(28, lang + "_" + item.get(28));
			// 画像
			item.set(5, path + "/img/" + lang + "_" + item.get(5));
			// ラベル
			item.set(1, getLabel(lang, arr.get(0)) + "_" + item.get(1));
			
			// tag1
			// tag1
			if (item.get(17).length() != 0) {
				item.set(17, lang + "_" + item.get(17));
			}
			if (item.get(18).length() != 0) {
				item.set(18, lang + "_" + item.get(18));
			}
			if (item.get(19).length() != 0) {
				item.set(19, lang + "_" + item.get(19));
			}
			if (item.get(20).length() != 0) {
				item.set(20, lang + "_" + item.get(20));
			}
			if (item.get(21).length() != 0) {
				item.set(21, lang + "_" + item.get(21));
			}
			
			ret.add(item);
		
		}
		return ret;
	}
	
	public List<List<String>> getListsByClassificationLabel(String lang, String code, String place) {
		List<List<String>> ret = new ArrayList<List<String>>();
		for(List<String> arr : cache) {
			if (arr.get(4).equals(code)) {
				List<String> item = new ArrayList<String>();
				for(int i=1;i<arr.size();i++) {
					item.add(arr.get(i));
				}
				// 参加ルールラベル
				item.set(2, lang + "_" + item.get(2));
				// キャッチコピー
				item.set(28, lang + "_" + item.get(28));
				// 画像
				item.set(5, path + "/img/" + lang + "_" + item.get(5));
				// ラベル
				item.set(1, getLabel(lang, arr.get(0)) + "_" + item.get(1));
				
				// 場所
				if (place != null) {
				item.set(16, place);
				}
				
				// tag1
				// tag1
				if (item.get(17).length() != 0) {
					item.set(17, lang + "_" + item.get(17));
				}
				if (item.get(18).length() != 0) {
					item.set(18, lang + "_" + item.get(18));
				}
				if (item.get(19).length() != 0) {
					item.set(19, lang + "_" + item.get(19));
				}
				if (item.get(20).length() != 0) {
					item.set(20, lang + "_" + item.get(20));
				}
				if (item.get(21).length() != 0) {
					item.set(21, lang + "_" + item.get(21));
				}
				
				ret.add(item);
			}
		}
		return ret;
	}
	
	public List<List<String>> getListsByCode(String lang, String code) {
		List<List<String>> ret = new ArrayList<List<String>>();
		for(List<String> arr : cache) {
			if (arr.get(1).equals(code)) {
				List<String> item = new ArrayList<String>();
				for(int i=1;i<arr.size();i++) {
					item.add(arr.get(i));
				}
				// 参加ルールラベル
				item.set(2, lang + "_" + item.get(2));
				// キャッチコピー
				item.set(28, lang + "_" + item.get(28));
				// 画像
				item.set(5, path + "/img/" + lang + "_" + item.get(5));
				// ラベル
				item.set(1, getLabel(lang, arr.get(0)) + "_" + item.get(1));
				
				// tag1
				// tag1
				if (item.get(17).length() != 0) {
					item.set(17, lang + "_" + item.get(17));
				}
				if (item.get(18).length() != 0) {
					item.set(18, lang + "_" + item.get(18));
				}
				if (item.get(19).length() != 0) {
					item.set(19, lang + "_" + item.get(19));
				}
				if (item.get(20).length() != 0) {
					item.set(20, lang + "_" + item.get(20));
				}
				if (item.get(21).length() != 0) {
					item.set(21, lang + "_" + item.get(21));
				}
				
				ret.add(item);
			}
		}
		return ret;
	}
	
	
	public List<List<String>> getListsByLever(String lang, String lever) {
		List<List<String>> ret = new ArrayList<List<String>>();
		for(List<String> arr : cache) {
			if (arr.get(4) == lever) {
				List<String> item = new ArrayList<String>();
				for(int i=1;i<arr.size();i++) {
					item.add(arr.get(i));
				}
				// 参加ルールラベル
				item.set(2, lang + "_" + item.get(2));
				// キャッチコピー
				item.set(28, lang + "_" + item.get(28));
				// 画像
				item.set(5, path + "/img/" + lang + "_" + item.get(5));
				// ラベル
				item.set(1, getLabel(lang, arr.get(0)) + "_" + item.get(1));
				
				// tag1
				// tag1
				if (item.get(17).length() != 0) {
					item.set(17, lang + "_" + item.get(17));
				}
				if (item.get(18).length() != 0) {
					item.set(18, lang + "_" + item.get(18));
				}
				if (item.get(19).length() != 0) {
					item.set(19, lang + "_" + item.get(19));
				}
				if (item.get(20).length() != 0) {
					item.set(20, lang + "_" + item.get(20));
				}
				if (item.get(21).length() != 0) {
					item.set(21, lang + "_" + item.get(21));
				}
				
				ret.add(item);
			}
		}
		return ret;
	}
	
	private String getLabel(String lang, String kind) {
		if (kind == "AE") {
			return lang=="ja"?"エベント":"Event";
		} else if (kind == "AC") {
			return lang=="ja"?"キャンペーン":"Campaign";
		} else if (kind == "AN") {
			return lang=="ja"?"コンテンツ":"Contents";
		}
		return "";
	}
	
	public List<String> getHeads() {
		return heads;
	}
}
