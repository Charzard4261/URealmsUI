package server;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import client.UI;
import javax.swing.border.MatteBorder;

public class ServerGMUI {

	private JFrame frame;
	private JPanel contentPane;
	private Timer timer = new Timer();

	private String[] list = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
			"12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39",
			"40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53",
			"54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67",
			"68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81",
			"82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95",
			"96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108",
			"109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120",
			"121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132",
			"133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144",
			"145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156",
			"157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168",
			"169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180",
			"181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192",
			"193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204",
			"205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216",
			"217", "218", "219", "220", "221", "222", "223", "224", "225", "226", "227", "228",
			"229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240",
			"241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252",
			"253", "254", "255", "256", "257", "258", "259", "260", "261", "262", "263", "264",
			"265", "266", "267", "268", "269", "270", "271", "272", "273", "274", "275", "276",
			"277", "278", "279", "280", "281", "282", "283", "284", "285", "286", "287", "288",
			"289", "290", "291", "292", "293", "294", "295", "296", "297", "298", "299", "300",
			"301", "302", "303", "304", "305", "306", "307", "308", "309", "310", "311", "312",
			"313", "314", "315", "316", "317", "318", "319", "320", "321", "322", "323", "324",
			"325", "326", "327", "328", "329", "330", "331", "332", "333", "334", "335", "336",
			"337", "338", "339", "340", "341", "342", "343", "344", "345", "346", "347", "348",
			"349", "350", "351", "352", "353", "354", "355", "356", "357", "358", "359", "360",
			"361", "362", "363", "364", "365", "366", "367", "368", "369", "370", "371", "372",
			"373", "374", "375", "376", "377", "378", "379", "380", "381", "382", "383", "384",
			"385", "386", "387", "388", "389", "390", "391", "392", "393", "394", "395", "396",
			"397", "398", "399", "400", "401", "402", "403", "404", "405", "406", "407", "408",
			"409", "410", "411", "412", "413", "414", "415", "416", "417", "418", "419", "420",
			"421", "422", "423", "424", "425", "426", "427", "428", "429", "430", "431", "432",
			"433", "434", "435", "436", "437", "438", "439", "440", "441", "442", "443", "444",
			"445", "446", "447", "448", "449", "450", "451", "452", "453", "454", "455", "456",
			"457", "458", "459", "460", "461", "462", "463", "464", "465", "466", "467", "468",
			"469", "470", "471", "472", "473", "474", "475", "476", "477", "478", "479", "480",
			"481", "482", "483", "484", "485", "486", "487", "488", "489", "490", "491", "492",
			"493", "494", "495", "496", "497", "498", "499", "500", "501", "502", "503", "504",
			"505", "506", "507", "508", "509", "510", "511", "512", "513", "514", "515", "516",
			"517", "518", "519", "520", "521", "522", "523", "524", "525", "526", "527", "528",
			"529", "530", "531", "532", "533", "534", "535", "536", "537", "538", "539", "540",
			"541", "542", "543", "544", "545", "546", "547", "548", "549", "550", "551", "552",
			"553", "554", "555", "556", "557", "558", "559", "560", "561", "562", "563", "564",
			"565", "566", "567", "568", "569", "570", "571", "572", "573", "574", "575", "576",
			"577", "578", "579", "580", "581", "582", "583", "584", "585", "586", "587", "588",
			"589", "590", "591", "592", "593", "594", "595", "596", "597", "598", "599", "600",
			"601", "602", "603", "604", "605", "606", "607", "608", "609", "610", "611", "612",
			"613", "614", "615", "616", "617", "618", "619", "620", "621", "622", "623", "624",
			"625", "626", "627", "628", "629", "630", "631", "632", "633", "634", "635", "636",
			"637", "638", "639", "640", "641", "642", "643", "644", "645", "646", "647", "648",
			"649", "650", "651", "652", "653", "654", "655", "656", "657", "658", "659", "660",
			"661", "662", "663", "664", "665", "666", "667", "668", "669", "670", "671", "672",
			"673", "674", "675", "676", "677", "678", "679", "680", "681", "682", "683", "684",
			"685", "686", "687", "688", "689", "690", "691", "692", "693", "694", "695", "696",
			"697", "698", "699", "700", "701", "702", "703", "704", "705", "706", "707", "708",
			"709", "710", "711", "712", "713", "714", "715", "716", "717", "718", "719", "720",
			"721", "722", "723", "724", "725", "726", "727", "728", "729", "730", "731", "732",
			"733", "734", "735", "736", "737", "738", "739", "740", "741", "742", "743", "744",
			"745", "746", "747", "748", "749", "750", "751", "752", "753", "754", "755", "756",
			"757", "758", "759", "760", "761", "762", "763", "764", "765", "766", "767", "768",
			"769", "770", "771", "772", "773", "774", "775", "776", "777", "778", "779", "780",
			"781", "782", "783", "784", "785", "786", "787", "788", "789", "790", "791", "792",
			"793", "794", "795", "796", "797", "798", "799", "800", "801", "802", "803", "804",
			"805", "806", "807", "808", "809", "810", "811", "812", "813", "814", "815", "816",
			"817", "818", "819", "820", "821", "822", "823", "824", "825", "826", "827", "828",
			"829", "830", "831", "832", "833", "834", "835", "836", "837", "838", "839", "840",
			"841", "842", "843", "844", "845", "846", "847", "848", "849", "850", "851", "852",
			"853", "854", "855", "856", "857", "858", "859", "860", "861", "862", "863", "864",
			"865", "866", "867", "868", "869", "870", "871", "872", "873", "874", "875", "876",
			"877", "878", "879", "880", "881", "882", "883", "884", "885", "886", "887", "888",
			"889", "890", "891", "892", "893", "894", "895", "896", "897", "898", "899", "900",
			"901", "902", "903", "904", "905", "906", "907", "908", "909", "910", "911", "912",
			"913", "914", "915", "916", "917", "918", "919", "920", "921", "922", "923", "924",
			"925", "926", "927", "928", "929", "930", "931", "932", "933", "934", "935", "936",
			"937", "938", "939", "940", "941", "942", "943", "944", "945", "946", "947", "948",
			"949", "950", "951", "952", "953", "954", "955", "956", "957", "958", "959", "960",
			"961", "962", "963", "964", "965", "966", "967", "968", "969", "970", "971", "972",
			"973", "974", "975", "976", "977", "978", "979", "980", "981", "982", "983", "984",
			"985", "986", "987", "988", "989", "990", "991", "992", "993", "994", "995", "996",
			"997", "998", "999", "1000" };

	private JLabel halllbl;
	private JButton hall1, hall3, hall5;

	private JLabel dalllbl;
	private JButton dall1, dall3, dall5;

	private int YOne = 130, YTwo = 500, YOffset = 60, XOne = 10, XTwo = 420, XOffsetOne = 45, XOffsetTwo = 120;

	private JTextField p1Name;
	public static JTextField p1Stam, p1Gold, p1c1Stam, p1c2Stam;
	private JButton player1Action1 = new JButton();
	private JButton player1Action2 = new JButton();
	private JButton player1Action3 = new JButton();
	private JButton player1Action4 = new JButton();
	private JButton player1Action5 = new JButton();

	private JTextField p2Name;
	public static JTextField p2Stam, p2Gold, p2c1Stam, p2c2Stam;
	private JButton player2Action1 = new JButton();
	private JButton player2Action2 = new JButton();
	private JButton player2Action3 = new JButton();
	private JButton player2Action4 = new JButton();
	private JButton player2Action5 = new JButton();

	private JTextField p3Name;
	public static JTextField p3Stam, p3Gold, p3c1Stam, p3c2Stam;
	private JButton player3Action1 = new JButton();
	private JButton player3Action2 = new JButton();
	private JButton player3Action3 = new JButton();
	private JButton player3Action4 = new JButton();
	private JButton player3Action5 = new JButton();

	private JTextField p4Name;
	public static JTextField p4Stam, p4Gold, p4c1Stam, p4c2Stam;
	private JButton player4Action1 = new JButton();
	private JButton player4Action2 = new JButton();
	private JButton player4Action3 = new JButton();
	private JButton player4Action4 = new JButton();
	private JButton player4Action5 = new JButton();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ServerGMUI()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				initUI();
			}
		});
	}

	private void initUI()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 775, 820);
		frame.setLocation((GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getDefaultScreenDevice().getDisplayMode().getWidth() / 2)
				- (frame.getWidth() / 2), (GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getDefaultScreenDevice().getDisplayMode().getHeight() / 2)
				- (frame.getHeight() / 2));
		frame.setResizable(false);
		frame.setVisible(true);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu settingsTab = new JMenu("Settings");
		settingsTab.setForeground(Color.BLACK);
		menuBar.add(settingsTab);

		JMenu maxStaminaTab = new JMenu("Maximum Player Stamina");
		settingsTab.add(maxStaminaTab);

		JMenu p1MaxStam = new JMenu("Player 1");
		maxStaminaTab.add(p1MaxStam);

		JScrollPane p1MaxStamSP = new JScrollPane();
		p1MaxStam.add(p1MaxStamSP);

		JList<String> p1MaxStamL = new JList<String>();
		p1MaxStamL.setVisibleRowCount(10);
		p1MaxStamL.setModel(new ListModel<String>() {

			@Override
			public void addListDataListener(ListDataListener arg0)
			{

			}

			@Override
			public String getElementAt(int arg0)
			{
				return list[arg0];
			}

			@Override
			public int getSize()
			{
				return list.length;
			}

			@Override
			public void removeListDataListener(ListDataListener arg0)
			{

			}
		});
		p1MaxStamL.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e)
			{
				JList<?> list = (JList<?>) e.getSource();

				Server.input("SetPlayer1Stam " + list.getSelectedValue());
				Server.player1Stam = Integer.valueOf((String) list.getSelectedValue());
			}
		});
		p1MaxStamSP.setViewportView(p1MaxStamL);

		JMenu p2MaxStam = new JMenu("Player 2");
		maxStaminaTab.add(p2MaxStam);

		JScrollPane p2MaxStamSP = new JScrollPane();
		p2MaxStam.add(p2MaxStamSP);

		JList<String> p2MaxStamL = new JList<String>();
		p2MaxStamL.setVisibleRowCount(10);
		p2MaxStamL.setModel(new ListModel<String>() {

			@Override
			public void addListDataListener(ListDataListener arg0)
			{

			}

			@Override
			public String getElementAt(int arg0)
			{
				return list[arg0];
			}

			@Override
			public int getSize()
			{
				return list.length;
			}

			@Override
			public void removeListDataListener(ListDataListener arg0)
			{

			}
		});
		p2MaxStamL.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e)
			{
				JList<?> list = (JList<?>) e.getSource();
				Server.input("SetPlayer2Stam " + list.getSelectedValue());
				Server.player2Stam = Integer.valueOf((String) list.getSelectedValue());
			}
		});
		p2MaxStamSP.setViewportView(p2MaxStamL);

		JMenu p3MaxStam = new JMenu("Player 3");
		maxStaminaTab.add(p3MaxStam);

		JScrollPane p3MaxStamSP = new JScrollPane();
		p3MaxStam.add(p3MaxStamSP);

		JList<String> p3MaxStamL = new JList<String>();
		p3MaxStamL.setVisibleRowCount(10);
		p3MaxStamL.setModel(new ListModel<String>() {

			@Override
			public void addListDataListener(ListDataListener arg0)
			{

			}

			@Override
			public String getElementAt(int arg0)
			{
				return list[arg0];
			}

			@Override
			public int getSize()
			{
				return list.length;
			}

			@Override
			public void removeListDataListener(ListDataListener arg0)
			{

			}
		});
		p3MaxStamL.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e)
			{
				JList<?> list = (JList<?>) e.getSource();
				Server.input("SetPlayer3Stam " + list.getSelectedValue());
				Server.player3Stam = Integer.valueOf((String) list.getSelectedValue());
			}
		});
		p3MaxStamSP.setViewportView(p3MaxStamL);

		JMenu p4MaxStam = new JMenu("Player 4");
		maxStaminaTab.add(p4MaxStam);

		JScrollPane p4MaxStamSP = new JScrollPane();
		p4MaxStam.add(p4MaxStamSP);

		JList<String> p4MaxStamL = new JList<String>();
		p4MaxStamL.setVisibleRowCount(10);
		p4MaxStamL.setModel(new ListModel<String>() {

			@Override
			public void addListDataListener(ListDataListener arg0)
			{

			}

			@Override
			public String getElementAt(int arg0)
			{
				return list[arg0];
			}

			@Override
			public int getSize()
			{
				return list.length;
			}

			@Override
			public void removeListDataListener(ListDataListener arg0)
			{

			}
		});
		p4MaxStamL.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e)
			{
				JList<?> list = (JList<?>) e.getSource();
				Server.input("SetPlayer4Stam " + list.getSelectedValue());
				Server.player4Stam = Integer.valueOf((String) list.getSelectedValue());
			}
		});
		p4MaxStamSP.setViewportView(p4MaxStamL);

		JMenu actionsTab = new JMenu("Player Actions");
		actionsTab.setEnabled(false);
		settingsTab.add(actionsTab);

		JMenu actionsP1 = new JMenu("Player 1");
		actionsP1.setEnabled(false);
		actionsTab.add(actionsP1);

		JMenu actionsP2 = new JMenu("Player 2");
		actionsP2.setEnabled(false);
		actionsTab.add(actionsP2);

		JMenu actionsP3 = new JMenu("Player 3");
		actionsP3.setEnabled(false);
		actionsTab.add(actionsP3);

		JMenu actionsP4 = new JMenu("Player 4");
		actionsP4.setEnabled(false);
		actionsTab.add(actionsP4);

		JMenu shieldTab = new JMenu("Shield");
		shieldTab.setEnabled(false);
		settingsTab.add(shieldTab);

		JMenu pIcons = new JMenu("Player Icons");
		settingsTab.add(pIcons);

		JButton btnTest = new JButton("This feature is not ready yet.");
		pIcons.add(btnTest);
		btnTest.addActionListener(new ActionListener() {
			// NEW FRAME - Options for normal, hurt and death roll. Save to file
			// Below is a file save TEST
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				List<String> lines = Arrays.asList("The first line", "The second line");
				Path file = Paths.get("(Rename) URealmsGMCharacterPortrait.txt");
				try
				{
					Files.write(file, lines, Charset.forName("UTF-8"));
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		});

		/*
		 * 
		 * 
		 * 
		 * 
		 * BODY
		 */

		final JToggleButton p1 = new JToggleButton("");
		p1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/EnablePlayers/P1E.png")));
		p1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/EnablePlayers/P1D.png")));
		p1.setContentAreaFilled(false);
		p1.setBorderPainted(false);
		p1.setBounds(10, 10, 30, 30);
		p1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (p1.isSelected())
				{
					Server.input("EnablePlayer1");
					Server.p1 = true;
				} else
				{
					Server.input("DisablePlayer1");
					Server.p1 = false;
				}
			}
		});

		final JToggleButton p2 = new JToggleButton("");
		p2.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/EnablePlayers/P2E.png")));
		p2.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/EnablePlayers/P2D.png")));
		p2.setContentAreaFilled(false);
		p2.setBorderPainted(false);
		p2.setBounds(50, 10, 30, 30);
		p2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (p2.isSelected())
				{
					Server.input("EnablePlayer2");
					Server.p2 = true;
				} else
				{
					Server.input("DisablePlayer2");
					Server.p2 = false;
				}
			}
		});

		final JToggleButton p3 = new JToggleButton("");
		p3.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/EnablePlayers/P3E.png")));
		p3.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/EnablePlayers/P3D.png")));
		p3.setContentAreaFilled(false);
		p3.setBorderPainted(false);
		p3.setBounds(90, 10, 30, 30);
		p3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (p3.isSelected())
				{
					Server.input("EnablePlayer3");
					Server.p3 = true;
				} else
				{
					Server.input("DisablePlayer3");
					Server.p3 = false;
				}
			}
		});

		final JToggleButton p4 = new JToggleButton("");
		p4.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/EnablePlayers/P4E.png")));
		p4.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/EnablePlayers/P4D.png")));
		p4.setContentAreaFilled(false);
		p4.setBorderPainted(false);
		p4.setBounds(130, 10, 30, 30);
		p4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (p4.isSelected())
				{
					Server.input("EnablePlayer4");
					Server.p4 = true;
				} else
				{
					Server.input("DisablePlayer4");
					Server.p4 = false;
				}
			}
		});

		JLabel lblEP = new JLabel("Enable Players");
		lblEP.setHorizontalAlignment(SwingConstants.CENTER);
		lblEP.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblEP.setBounds(10, 45, 100, 30);

		JButton ha = new JButton("Heal All");
		ha.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		ha.setBounds(180, 10, 100, 30);
		ha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				Server.player1CStam = Server.player1Stam;
				Server.player2CStam = Server.player2Stam;
				Server.player3CStam = Server.player3Stam;
				Server.player4CStam = Server.player4Stam;
				Server.input("HealAll");
			}
		});

		JButton nr = new JButton("New Round");
		nr.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		nr.setBounds(180, 40, 100, 32);
		nr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				Server.player1Action1 = true;
				Server.player1Action2 = true;
				Server.player2Action1 = true;
				Server.player2Action2 = true;
				Server.player3Action1 = true;
				Server.player3Action2 = true;
				Server.player4Action1 = true;
				Server.player4Action2 = true;

				Server.input("NewRound");
				player1Action1.setSelected(false);
				player1Action2.setSelected(false);
				player2Action1.setSelected(false);
				player2Action2.setSelected(false);
				player3Action1.setSelected(false);
				player3Action2.setSelected(false);
				player4Action1.setSelected(false);
				player4Action2.setSelected(false);
			}
		});

		halllbl = new JLabel("Heal All For");
		halllbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		halllbl.setHorizontalAlignment(SwingConstants.CENTER);
		halllbl.setBounds(290, 5, 100, 30);

		dalllbl = new JLabel("Damage All For");
		dalllbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		dalllbl.setHorizontalAlignment(SwingConstants.CENTER);
		dalllbl.setBounds(290, 40, 100, 30);

		hall1 = new JButton("");
		hall1.setIcon(new ImageIcon(ServerGMUI.class.getResource("/resources/GMUI/Stamina/1+.jpg")));
		hall1.setPressedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		hall1.setContentAreaFilled(false);
		hall1.setBorderPainted(false);
		hall1.setBounds(400, 10, 40, 20);
		hall1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				hall1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						hall1.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam + 1;
				Server.player2CStam = Server.player2CStam + 1;
				Server.player3CStam = Server.player3CStam + 1;
				Server.player4CStam = Server.player4CStam + 1;

				Server.input("Player1Add 1");
				Server.input("Player2Add 1");
				Server.input("Player3Add 1");
				Server.input("Player4Add 1");
			}
		});

		hall3 = new JButton("");
		hall3.setIcon(new ImageIcon(ServerGMUI.class.getResource("/resources/GMUI/Stamina/5+.jpg")));
		hall3.setPressedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		hall3.setContentAreaFilled(false);
		hall3.setBorderPainted(false);
		hall3.setBounds(440, 10, 40, 20);
		hall3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				hall3.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						hall3.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam + 5;
				Server.player2CStam = Server.player2CStam + 5;
				Server.player3CStam = Server.player3CStam + 5;
				Server.player4CStam = Server.player4CStam + 5;

				Server.input("Player1Add 5");
				Server.input("Player2Add 5");
				Server.input("Player3Add 5");
				Server.input("Player4Add 5");
			}
		});

		hall5 = new JButton("");
		hall5.setIcon(new ImageIcon(ServerGMUI.class.getResource("/resources/GMUI/Stamina/10+.jpg")));
		hall5.setPressedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		hall5.setContentAreaFilled(false);
		hall5.setBorderPainted(false);
		hall5.setBounds(480, 10, 40, 20);
		hall5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				hall5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						hall5.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam + 10;
				Server.player2CStam = Server.player2CStam + 10;
				Server.player3CStam = Server.player3CStam + 10;
				Server.player4CStam = Server.player4CStam + 10;

				Server.input("Player1Add 10");
				Server.input("Player2Add 10");
				Server.input("Player3Add 10");
				Server.input("Player4Add 10");
			}
		});

		dall1 = new JButton("");
		dall1.setIcon(new ImageIcon(ServerGMUI.class.getResource("/resources/GMUI/Stamina/1-.jpg")));
		dall1.setPressedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		dall1.setContentAreaFilled(false);
		dall1.setBorderPainted(false);
		dall1.setBounds(400, 45, 40, 20);
		dall1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				dall1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						dall1.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam - 1;
				Server.player2CStam = Server.player2CStam - 1;
				Server.player3CStam = Server.player3CStam - 1;
				Server.player4CStam = Server.player4CStam - 1;

				Server.input("Player1Subtract 1");
				Server.input("Player2Subtract 1");
				Server.input("Player3Subtract 1");
				Server.input("Player4Subtract 1");
			}
		});

		dall3 = new JButton("");
		dall3.setIcon(new ImageIcon(ServerGMUI.class.getResource("/resources/GMUI/Stamina/5-.jpg")));
		dall3.setPressedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		dall3.setContentAreaFilled(false);
		dall3.setBorderPainted(false);
		dall3.setBounds(440, 45, 40, 20);
		dall3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				dall3.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						dall3.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam - 5;
				Server.player2CStam = Server.player2CStam - 5;
				Server.player3CStam = Server.player3CStam - 5;
				Server.player4CStam = Server.player4CStam - 5;

				Server.input("Player1Subtract 5");
				Server.input("Player2Subtract 5");
				Server.input("Player3Subtract 5");
				Server.input("Player4Subtract 5");
			}
		});

		dall5 = new JButton("");
		dall5.setIcon(new ImageIcon(ServerGMUI.class.getResource("/resources/GMUI/Stamina/10-.jpg")));
		dall5.setPressedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		dall5.setContentAreaFilled(false);
		dall5.setBorderPainted(false);
		dall5.setBounds(480, 45, 40, 20);
		dall5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				dall5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						dall5.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam - 10;
				Server.player2CStam = Server.player2CStam - 10;
				Server.player3CStam = Server.player3CStam - 10;
				Server.player4CStam = Server.player4CStam - 10;

				Server.input("Player1Subtract 10");
				Server.input("Player2Subtract 10");
				Server.input("Player3Subtract 10");
				Server.input("Player4Subtract 10");
			}
		});

		/**
		 * Player 1
		 **/
		JLabel lblP1 = new JLabel("Player 1 Options");
		lblP1.setHorizontalAlignment(SwingConstants.CENTER);
		lblP1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblP1.setBounds(125, 90, 110, 30);

		p1Name = new JTextField();
		p1Name.setBackground(new Color(211, 186, 146));
		p1Name.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(62, 47, 28)));
		p1Name.setBounds(245, 95, 86, 20);

		p1Stam = new JTextField("10/10");
		p1Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p1Stam.setEditable(false);
		p1Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p1Stam.setBounds(145, 125, 70, 30);

		final JButton p1plus1 = new JButton("");
		p1plus1.setContentAreaFilled(false);
		p1plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p1plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p1plus1.setBorderPainted(false);
		p1plus1.setBounds(XOne, YOne, 40, 20);
		p1plus1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1plus1.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam + 1;

				Server.input("Player1Add 1");
			}
		});

		final JButton p1plus5 = new JButton("");
		p1plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p1plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p1plus5.setContentAreaFilled(false);
		p1plus5.setBorderPainted(false);
		p1plus5.setBounds(XOne + XOffsetOne, YOne, 40, 20);
		p1plus5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1plus5.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam + 5;

				Server.input("Player1Add 5");
			}
		});

		final JButton p1plus10 = new JButton("");
		p1plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p1plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p1plus10.setContentAreaFilled(false);
		p1plus10.setBorderPainted(false);
		p1plus10.setBounds(XOne + (XOffsetOne * 2), YOne, 40, 20);
		p1plus10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1plus10.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam + 10;

				Server.input("Player1Add 10");
			}
		});

		final JButton p1minus1 = new JButton("");
		p1minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p1minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p1minus1.setContentAreaFilled(false);
		p1minus1.setBorderPainted(false);
		p1minus1.setBounds(XOne + (XOffsetOne * 2) + XOffsetTwo, YOne, 40, 20);
		p1minus1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1minus1.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam - 1;

				Server.input("Player1Subtract 1");
			}
		});

		final JButton p1minus5 = new JButton("");
		p1minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p1minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p1minus5.setContentAreaFilled(false);
		p1minus5.setBorderPainted(false);
		p1minus5.setBounds(XOne + (XOffsetOne * 3) + XOffsetTwo, YOne, 40, 20);
		p1minus5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1minus5.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam - 5;

				Server.input("Player1Subtract 5");
			}
		});

		final JButton p1minus10 = new JButton("");
		p1minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p1minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p1minus10.setContentAreaFilled(false);
		p1minus10.setBorderPainted(false);
		p1minus10.setBounds(XOne + (XOffsetOne * 4) + XOffsetTwo, YOne, 40, 20);
		p1minus10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1minus10.setSelected(false);
					}
				}, 100L);

				Server.player1CStam = Server.player1CStam - 10;

				Server.input("Player1Subtract 10");
			}
		});

		JLabel p1Goldlbl = new JLabel("Gold");
		p1Goldlbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p1Goldlbl.setHorizontalAlignment(SwingConstants.CENTER);
		p1Goldlbl.setBounds(145, 160, 70, 20);

		p1Gold = new JTextField("0");
		p1Gold.setHorizontalAlignment(SwingConstants.CENTER);
		p1Gold.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p1Gold.setEditable(false);
		p1Gold.setBounds(145, 185, 70, 30);

		final JButton p1plus10gold = new JButton("");
		p1plus10gold.setBorderPainted(false);
		p1plus10gold.setContentAreaFilled(false);
		p1plus10gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10+.png")));
		p1plus10gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10+p.jpg")));
		p1plus10gold.setBounds(XOne, YOne + YOffset, 40, 20);
		p1plus10gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1plus10gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1plus10gold.setSelected(false);
					}
				}, 100L);

				Server.player1Gold = Server.player1Gold + 10;
				Server.input("AddPlayer1Gold 10");
			}
		});

		final JButton p1plus100gold = new JButton("");
		p1plus100gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100+p.jpg")));
		p1plus100gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100+.jpg")));
		p1plus100gold.setContentAreaFilled(false);
		p1plus100gold.setBorderPainted(false);
		p1plus100gold.setBounds(XOne + XOffsetOne, YOne + YOffset, 40, 20);
		p1plus100gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1plus100gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1plus100gold.setSelected(false);
					}
				}, 100L);

				Server.player1Gold = Server.player1Gold + 100;
				Server.input("AddPlayer1Gold 100");
			}
		});

		final JButton p1plus500gold = new JButton("");
		p1plus500gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500+p.jpg")));
		p1plus500gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500+.jpg")));
		p1plus500gold.setContentAreaFilled(false);
		p1plus500gold.setBorderPainted(false);
		p1plus500gold.setBounds(XOne + (XOffsetOne * 2), YOne + YOffset, 40, 20);
		p1plus500gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1plus500gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1plus500gold.setSelected(false);
					}
				}, 100L);

				Server.player1Gold = Server.player1Gold + 500;
				Server.input("AddPlayer1Gold 500");
			}
		});

		final JButton p1minus10gold = new JButton("");
		p1minus10gold.setContentAreaFilled(false);
		p1minus10gold.setBorderPainted(false);
		p1minus10gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10-.png")));
		p1minus10gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10-p.jpg")));
		p1minus10gold.setBounds(XOne + (XOffsetOne * 2) + XOffsetTwo, YOne + YOffset, 40, 20);
		p1minus10gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1minus10gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1minus10gold.setSelected(false);
					}
				}, 100L);

				Server.player1Gold = Server.player1Gold - 10;
				Server.input("SubtractPlayer1Gold 10");
			}
		});

		final JButton p1minus100gold = new JButton("");
		p1minus100gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100-p.jpg")));
		p1minus100gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100-.jpg")));
		p1minus100gold.setContentAreaFilled(false);
		p1minus100gold.setBorderPainted(false);
		p1minus100gold.setBounds(XOne + (XOffsetOne * 3) + XOffsetTwo, YOne + YOffset, 40, 20);
		p1minus100gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1minus100gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1minus100gold.setSelected(false);
					}
				}, 100L);

				Server.player1Gold = Server.player1Gold - 100;
				Server.input("SubtractPlayer1Gold 100");
			}
		});

		final JButton p1minus500gold = new JButton("");
		p1minus500gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500-p.jpg")));
		p1minus500gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500-.jpg")));
		p1minus500gold.setContentAreaFilled(false);
		p1minus500gold.setBorderPainted(false);
		p1minus500gold.setBounds(XOne + (XOffsetOne * 4) + XOffsetTwo, YOne + YOffset, 40, 20);
		p1minus500gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p1minus500gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1minus500gold.setSelected(false);
					}
				}, 100L);

				Server.player1Gold = Server.player1Gold - 500;
				Server.input("SubtractPlayer1Gold 500");
			}
		});

		JLabel p1c1lbl = new JLabel("Companion 1");
		p1c1lbl.setHorizontalAlignment(SwingConstants.CENTER);
		p1c1lbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p1c1lbl.setBounds(140, 220, 80, 20);

		p1c1Stam = new JTextField("10/10");
		p1c1Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p1c1Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p1c1Stam.setEditable(false);
		p1c1Stam.setBounds(145, 245, 70, 30);

		final JButton p1c1plus1 = new JButton("");
		p1c1plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p1c1plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p1c1plus1.setBorderPainted(false);
		p1c1plus1.setContentAreaFilled(false);
		p1c1plus1.setBounds(XOne, YOne + (YOffset * 2), 40, 20);
		p1c1plus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c1plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c1plus1.setSelected(false);
					}
				}, 100L);

				Server.player1c1CStam = Server.player1c1CStam + 1;

				Server.input("AddPlayer1c1Stam 1");
			}
		});

		final JButton p1c1plus5 = new JButton("");
		p1c1plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p1c1plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p1c1plus5.setBorderPainted(false);
		p1c1plus5.setContentAreaFilled(false);
		p1c1plus5.setBounds(XOne + XOffsetOne, YOne + (YOffset * 2), 40, 20);
		p1c1plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c1plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c1plus5.setSelected(false);
					}
				}, 100L);

				Server.player1c1CStam = Server.player1c1CStam + 5;

				Server.input("AddPlayer1c1Stam 5");
			}
		});

		final JButton p1c1plus10 = new JButton("");
		p1c1plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p1c1plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p1c1plus10.setBorderPainted(false);
		p1c1plus10.setContentAreaFilled(false);
		p1c1plus10.setBounds(XOne + (XOffsetOne * 2), YOne + (YOffset * 2), 40, 20);
		p1c1plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c1plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c1plus10.setSelected(false);
					}
				}, 100L);

				Server.player1c1CStam = Server.player1c1CStam + 10;

				Server.input("AddPlayer1c1Stam 10");
			}
		});

		final JButton p1c1minus1 = new JButton("");
		p1c1minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p1c1minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p1c1minus1.setBorderPainted(false);
		p1c1minus1.setContentAreaFilled(false);
		p1c1minus1.setBounds(XOne + (XOffsetOne * 2) + XOffsetTwo, YOne + (YOffset * 2), 40, 20);
		p1c1minus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c1minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c1minus1.setSelected(false);
					}
				}, 100L);

				Server.player1c1CStam = Server.player1c1CStam - 1;

				Server.input("SubtractPlayer1c1Stam 1");
			}
		});

		final JButton p1c1minus5 = new JButton("");
		p1c1minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p1c1minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p1c1minus5.setBorderPainted(false);
		p1c1minus5.setContentAreaFilled(false);
		p1c1minus5.setBounds(XOne + (XOffsetOne * 3) + XOffsetTwo, YOne + (YOffset * 2), 40, 20);
		p1c1minus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c1minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c1minus5.setSelected(false);
					}
				}, 100L);

				Server.player1c1CStam = Server.player1c1CStam - 5;

				Server.input("SubtractPlayer1c1Stam 5");
			}
		});

		final JButton p1c1minus10 = new JButton("");
		p1c1minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p1c1minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p1c1minus10.setBorderPainted(false);
		p1c1minus10.setContentAreaFilled(false);
		p1c1minus10.setBounds(XOne + (XOffsetOne * 4) + XOffsetTwo, YOne + (YOffset * 2), 40, 20);
		p1c1minus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c1minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c1minus10.setSelected(false);
					}
				}, 100L);

				Server.player1c1CStam = Server.player1c1CStam - 10;

				Server.input("SubtractPlayer1c1Stam 10");
			}
		});

		JLabel p1c2lbl = new JLabel("Companion 2");
		p1c2lbl.setHorizontalAlignment(SwingConstants.CENTER);
		p1c2lbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p1c2lbl.setBounds(140, 280, 80, 20);

		p1c2Stam = new JTextField("10/10");
		p1c2Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p1c2Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p1c2Stam.setEditable(false);
		p1c2Stam.setBounds(145, 305, 70, 30);

		final JButton p1c2plus1 = new JButton("");
		p1c2plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p1c2plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p1c2plus1.setBorderPainted(false);
		p1c2plus1.setContentAreaFilled(false);
		p1c2plus1.setBounds(10, 310, 40, 20);
		p1c2plus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c2plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c2plus1.setSelected(false);
					}
				}, 100L);

				Server.player1c2CStam = Server.player1c2CStam + 1;

				Server.input("AddPlayer1c2Stam 1");
			}
		});

		final JButton p1c2plus5 = new JButton("");
		p1c2plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p1c2plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p1c2plus5.setBorderPainted(false);
		p1c2plus5.setContentAreaFilled(false);
		p1c2plus5.setBounds(55, 310, 40, 20);
		p1c2plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c2plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c2plus5.setSelected(false);
					}
				}, 100L);

				Server.player1c2CStam = Server.player1c2CStam + 5;

				Server.input("AddPlayer1c2Stam 5");
			}
		});

		final JButton p1c2plus10 = new JButton("");
		p1c2plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p1c2plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p1c2plus10.setBorderPainted(false);
		p1c2plus10.setContentAreaFilled(false);
		p1c2plus10.setBounds(100, 310, 40, 20);
		p1c2plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c2plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c2plus10.setSelected(false);
					}
				}, 100L);

				Server.player1c2CStam = Server.player1c2CStam + 10;

				Server.input("AddPlayer1c2Stam 10");
			}
		});

		final JButton p1c2minus1 = new JButton("");
		p1c2minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p1c2minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p1c2minus1.setBorderPainted(false);
		p1c2minus1.setContentAreaFilled(false);
		p1c2minus1.setBounds(220, 310, 40, 20);
		p1c2minus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c2minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c2minus1.setSelected(false);
					}
				}, 100L);

				Server.player1c2CStam = Server.player1c2CStam - 1;

				Server.input("SubtractPlayer1c2Stam 1");
			}
		});

		final JButton p1c2minus5 = new JButton("");
		p1c2minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p1c2minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p1c2minus5.setBorderPainted(false);
		p1c2minus5.setContentAreaFilled(false);
		p1c2minus5.setBounds(265, 310, 40, 20);
		p1c2minus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c2minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c2minus5.setSelected(false);
					}
				}, 100L);

				Server.player1c2CStam = Server.player1c2CStam - 5;

				Server.input("SubtractPlayer1c2Stam 5");
			}
		});

		final JButton p1c2minus10 = new JButton("");
		p1c2minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p1c2minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p1c2minus10.setBorderPainted(false);
		p1c2minus10.setContentAreaFilled(false);
		p1c2minus10.setBounds(310, 310, 40, 20);
		p1c2minus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p1c2minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p1c2minus10.setSelected(false);
					}
				}, 100L);

				Server.player1c2CStam = Server.player1c2CStam - 10;

				Server.input("SubtractPlayer1c2Stam 10");
			}
		});

		player1Action1.setBorder(null);
		player1Action1.setContentAreaFilled(false);
		player1Action1.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/move.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player1Action1.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player1Action1.setBounds(0, 340, 60, 60);
		player1Action1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player1Action1.isSelected())
				{
					player1Action1.setSelected(false);
					Server.player1Action1 = true;
					Server.input("AddPlayer1Action1");
				} else
				{
					player1Action1.setSelected(true);
					Server.player1Action1 = false;
					Server.input("RemovePlayer1Action1");
				}
			}
		});

		JLabel slotPlayer1Action1 = new JLabel();
		slotPlayer1Action1.setBorder(null);
		slotPlayer1Action1.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer1Action1.setBounds(0, 340, 60, 60);
		contentPane.add(lblEP);
		contentPane.add(ha);
		contentPane.add(nr);
		contentPane.add(halllbl);
		contentPane.add(dalllbl);
		contentPane.add(hall1);
		contentPane.add(hall3);
		contentPane.add(hall5);
		contentPane.add(dall1);
		contentPane.add(dall3);
		contentPane.add(dall5);
		contentPane.add(lblP1);
		contentPane.add(p1Name);
		contentPane.add(p1Stam);
		contentPane.add(p1plus1);
		contentPane.add(p1minus1);
		contentPane.add(p1plus5);
		contentPane.add(p1minus5);
		contentPane.add(p1plus10);
		contentPane.add(p1minus10);
		contentPane.add(p1Goldlbl);
		contentPane.add(p1Gold);
		contentPane.add(p1plus10gold);
		contentPane.add(p1minus10gold);
		contentPane.add(p1plus100gold);
		contentPane.add(p1minus100gold);
		contentPane.add(p1plus500gold);
		contentPane.add(p1minus500gold);
		contentPane.add(p1c1lbl);
		contentPane.add(p1c1Stam);
		contentPane.add(p1c1plus1);
		contentPane.add(p1c1plus5);
		contentPane.add(p1c1plus10);
		contentPane.add(p1c1minus1);
		contentPane.add(p1c1minus5);
		contentPane.add(p1c1minus10);
		contentPane.add(p1c2lbl);
		contentPane.add(p1c2Stam);
		contentPane.add(p1c2plus1);
		contentPane.add(p1c2plus5);
		contentPane.add(p1c2plus10);
		contentPane.add(p1c2minus1);
		contentPane.add(p1c2minus5);
		contentPane.add(p1c2minus10);
		contentPane.add(player1Action1);
		contentPane.add(slotPlayer1Action1);

		player1Action2.setBorder(null);
		player1Action2.setContentAreaFilled(false);
		player1Action2.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/action.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player1Action2.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player1Action2.setBounds(45, 340, 60, 60);
		contentPane.add(player1Action2);
		player1Action2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player1Action2.isSelected())
				{
					player1Action2.setSelected(false);
					Server.player1Action2 = true;
					Server.input("AddPlayer1Action2");
				} else
				{
					player1Action2.setSelected(true);
					Server.player1Action2 = false;
					Server.input("RemovePlayer1Action2");
				}
			}
		});

		JLabel slotPlayer1Action2 = new JLabel();
		slotPlayer1Action2.setBorder(null);
		slotPlayer1Action2.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer1Action2.setBounds(45, 340, 60, 60);
		contentPane.add(slotPlayer1Action2);

		player1Action3.setBorder(null);
		player1Action3.setContentAreaFilled(false);
		player1Action3.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player1Action3.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player1Action3.setBounds(90, 340, 60, 60);
		contentPane.add(player1Action3);
		player1Action3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player1Action3.isSelected())
				{
					player1Action3.setSelected(false);
					Server.player1Action3 = true;
					Server.input("AddPlayer1Action3");
				} else
				{
					player1Action3.setSelected(true);
					Server.player1Action3 = false;
					Server.input("RemovePlayer1Action3");
				}
			}
		});

		JLabel slotPlayer1Action3 = new JLabel();
		slotPlayer1Action3.setBorder(null);
		slotPlayer1Action3.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer1Action3.setBounds(90, 340, 60, 60);
		contentPane.add(slotPlayer1Action3);

		player1Action4.setBorder(null);
		player1Action4.setContentAreaFilled(false);
		player1Action4.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player1Action4.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player1Action4.setBounds(150, 340, 60, 60);
		contentPane.add(player1Action4);
		player1Action4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player1Action4.isSelected())
				{
					player1Action4.setSelected(false);
					Server.player1Action4 = true;
					Server.input("AddPlayer1Action4");
				} else
				{
					player1Action4.setSelected(true);
					Server.player1Action4 = false;
					Server.input("RemovePlayer1Action4");
				}
			}
		});

		JLabel slotPlayer1Action4 = new JLabel();
		slotPlayer1Action4.setBorder(null);
		slotPlayer1Action4.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer1Action4.setBounds(150, 340, 60, 60);
		contentPane.add(slotPlayer1Action4);

		player1Action5.setBorder(null);
		player1Action5.setContentAreaFilled(false);
		player1Action5.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player1Action5.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player1Action5.setBounds(210, 340, 60, 60);
		contentPane.add(player1Action5);
		player1Action5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player1Action5.isSelected())
				{
					player1Action5.setSelected(false);
					Server.player1Action5 = true;
					Server.input("AddPlayer1Action5");
				} else
				{
					player1Action5.setSelected(true);
					Server.player1Action5 = false;
					Server.input("RemovePlayer1Action5");
				}
			}
		});

		JLabel slotPlayer1Action5 = new JLabel();
		slotPlayer1Action5.setBorder(null);
		slotPlayer1Action5.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer1Action5.setBounds(210, 340, 60, 60);
		contentPane.add(slotPlayer1Action5);

		JLabel slotPlayer1Action6 = new JLabel();
		slotPlayer1Action6.setEnabled(false);
		slotPlayer1Action6.setVisible(false);
		slotPlayer1Action6.setBorder(null);
		slotPlayer1Action6.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer1Action6.setBounds(255, 340, 60, 60);
		contentPane.add(slotPlayer1Action6);

		JLabel slotPlayer1Action7 = new JLabel();
		slotPlayer1Action7.setVisible(false);
		slotPlayer1Action7.setEnabled(false);
		slotPlayer1Action7.setBorder(null);
		slotPlayer1Action7.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer1Action7.setBounds(300, 340, 60, 60);
		contentPane.add(slotPlayer1Action7);

		JLabel slotPlayer1Action8 = new JLabel();
		slotPlayer1Action8.setEnabled(false);
		slotPlayer1Action8.setVisible(false);
		slotPlayer1Action8.setBorder(null);
		slotPlayer1Action8.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer1Action8.setBounds(150, 380, 60, 60);
		contentPane.add(slotPlayer1Action8);

		JLabel lblP2 = new JLabel("Player 2 Options");
		lblP2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblP2.setBounds(535, 90, 110, 30);
		contentPane.add(lblP2);

		p2Name = new JTextField();
		p2Name.setBackground(new Color(211, 186, 146));
		p2Name.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(62, 47, 28)));
		p2Name.setBounds(655, 95, 86, 20);
		contentPane.add(p2Name);

		p2Stam = new JTextField("10/10");
		p2Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p2Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p2Stam.setEditable(false);
		p2Stam.setBounds(555, 125, 70, 30);
		contentPane.add(p2Stam);

		final JButton p2plus1 = new JButton("");
		p2plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p2plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p2plus1.setContentAreaFilled(false);
		p2plus1.setBorderPainted(false);
		p2plus1.setBounds(420, 130, 40, 20);
		contentPane.add(p2plus1);
		p2plus1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2plus1.setSelected(false);
					}
				}, 100L);

				Server.player2CStam = Server.player2CStam + 1;

				Server.input("Player2Add 1");
			}
		});

		final JButton p2minus1 = new JButton("");
		p2minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p2minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p2minus1.setContentAreaFilled(false);
		p2minus1.setBorderPainted(false);
		p2minus1.setBounds(630, 130, 40, 20);
		contentPane.add(p2minus1);
		p2minus1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2minus1.setSelected(false);
					}
				}, 100L);

				Server.player2CStam = Server.player2CStam - 1;

				Server.input("Player2Subtract 1");
			}
		});

		final JButton p2plus5 = new JButton("");
		p2plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p2plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p2plus5.setContentAreaFilled(false);
		p2plus5.setBorderPainted(false);
		p2plus5.setBounds(465, 130, 40, 20);
		contentPane.add(p2plus5);
		p2plus5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2plus5.setSelected(false);
					}
				}, 100L);

				Server.player2CStam = Server.player2CStam + 5;

				Server.input("Player2Add 5");
			}
		});

		final JButton p2minus5 = new JButton("");
		p2minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p2minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p2minus5.setContentAreaFilled(false);
		p2minus5.setBorderPainted(false);
		p2minus5.setBounds(675, 130, 40, 20);
		contentPane.add(p2minus5);
		p2minus5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2minus5.setSelected(false);
					}
				}, 100L);

				Server.player2CStam = Server.player2CStam - 5;

				Server.input("Player2Subtract 5");
			}
		});

		final JButton p2plus10 = new JButton("");
		p2plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p2plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p2plus10.setContentAreaFilled(false);
		p2plus10.setBorderPainted(false);
		p2plus10.setBounds(510, 130, 40, 20);
		contentPane.add(p2plus10);
		p2plus10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2plus10.setSelected(false);
					}
				}, 100L);

				Server.player2CStam = Server.player2CStam + 10;

				Server.input("Player2Add 10");
			}
		});

		final JButton p2minus10 = new JButton("");
		p2minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p2minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p2minus10.setContentAreaFilled(false);
		p2minus10.setBorderPainted(false);
		p2minus10.setBounds(720, 130, 40, 20);
		contentPane.add(p2minus10);
		p2minus10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2minus10.setSelected(false);
					}
				}, 100L);

				Server.player2CStam = Server.player2CStam - 10;

				Server.input("Player2Subtract 10");
			}
		});

		p2Gold = new JTextField("0");
		p2Gold.setHorizontalAlignment(SwingConstants.CENTER);
		p2Gold.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p2Gold.setEditable(false);
		p2Gold.setBounds(555, 185, 70, 30);
		contentPane.add(p2Gold);

		JLabel p2Goldlbl = new JLabel("Gold");
		p2Goldlbl.setHorizontalAlignment(SwingConstants.CENTER);
		p2Goldlbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p2Goldlbl.setBounds(555, 160, 70, 20);
		contentPane.add(p2Goldlbl);

		final JButton p2plus10gold = new JButton("");
		p2plus10gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10+p.jpg")));
		p2plus10gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10+.png")));
		p2plus10gold.setContentAreaFilled(false);
		p2plus10gold.setBorderPainted(false);
		p2plus10gold.setBounds(420, 190, 40, 20);
		contentPane.add(p2plus10gold);
		p2plus10gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2plus10gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2plus10gold.setSelected(false);
					}
				}, 100L);

				Server.player2Gold = Server.player2Gold + 10;
				Server.input("AddPlayer2Gold 10");
			}
		});

		final JButton p2minus10gold = new JButton("");
		p2minus10gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10-.png")));
		p2minus10gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10-p.jpg")));
		p2minus10gold.setContentAreaFilled(false);
		p2minus10gold.setBorderPainted(false);
		p2minus10gold.setBounds(630, 190, 40, 20);
		contentPane.add(p2minus10gold);
		p2minus10gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2minus10gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2minus10gold.setSelected(false);
					}
				}, 100L);

				Server.player2Gold = Server.player2Gold - 10;
				Server.input("SubtractPlayer2Gold 10");
			}
		});

		final JButton p2plus100gold = new JButton("");
		p2plus100gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100+p.jpg")));
		p2plus100gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100+.jpg")));
		p2plus100gold.setContentAreaFilled(false);
		p2plus100gold.setBorderPainted(false);
		p2plus100gold.setBounds(465, 190, 40, 20);
		contentPane.add(p2plus100gold);
		p2plus100gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{

				p2plus100gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2plus100gold.setSelected(false);
					}
				}, 100L);

				Server.player2Gold = Server.player2Gold + 100;
				Server.input("AddPlayer2Gold 100");
			}
		});

		final JButton p2minus100gold = new JButton("");
		p2minus100gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100-.jpg")));
		p2minus100gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100-p.jpg")));
		p2minus100gold.setContentAreaFilled(false);
		p2minus100gold.setBorderPainted(false);
		p2minus100gold.setBounds(675, 190, 40, 20);
		contentPane.add(p2minus100gold);
		p2minus100gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2minus100gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2minus100gold.setSelected(false);
					}
				}, 100L);

				Server.player2Gold = Server.player2Gold - 100;
				Server.input("SubtractPlayer2Gold 100");
			}
		});

		final JButton p2plus500gold = new JButton("");
		p2plus500gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500+p.jpg")));
		p2plus500gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500+.jpg")));
		p2plus500gold.setContentAreaFilled(false);
		p2plus500gold.setBorderPainted(false);
		p2plus500gold.setBounds(510, 190, 40, 20);
		contentPane.add(p2plus500gold);
		p2plus500gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2plus500gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2plus500gold.setSelected(false);
					}
				}, 100L);

				Server.player2Gold = Server.player2Gold + 500;
				Server.input("AddPlayer2Gold 500");
			}
		});

		final JButton p2minus500gold = new JButton("");
		p2minus500gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500-p.jpg")));
		p2minus500gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500-.jpg")));
		p2minus500gold.setContentAreaFilled(false);
		p2minus500gold.setBorderPainted(false);
		p2minus500gold.setBounds(720, 190, 40, 20);
		contentPane.add(p2minus500gold);
		p2minus500gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p2minus500gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2minus500gold.setSelected(false);
					}
				}, 100L);

				Server.player2Gold = Server.player2Gold - 500;
				Server.input("SubtractPlayer2Gold 500");
			}
		});

		JLabel p2c1lbl = new JLabel("Companion 1");
		p2c1lbl.setHorizontalAlignment(SwingConstants.CENTER);
		p2c1lbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p2c1lbl.setBounds(550, 220, 80, 20);
		contentPane.add(p2c1lbl);

		p2c1Stam = new JTextField("10/10");
		p2c1Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p2c1Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p2c1Stam.setEditable(false);
		p2c1Stam.setBounds(555, 245, 70, 30);
		contentPane.add(p2c1Stam);

		final JButton p2c1plus1 = new JButton("");
		p2c1plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p2c1plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p2c1plus1.setBorderPainted(false);
		p2c1plus1.setContentAreaFilled(false);
		p2c1plus1.setBounds(420, 250, 40, 20);
		contentPane.add(p2c1plus1);
		p2c1plus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c1plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c1plus1.setSelected(false);
					}
				}, 100L);

				Server.player2c1CStam = Server.player2c1CStam + 1;

				Server.input("AddPlayer2c1Stam 1");
			}
		});

		final JButton p2c1plus5 = new JButton("");
		p2c1plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p2c1plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p2c1plus5.setBorderPainted(false);
		p2c1plus5.setContentAreaFilled(false);
		p2c1plus5.setBounds(465, 250, 40, 20);
		contentPane.add(p2c1plus5);
		p2c1plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c1plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c1plus5.setSelected(false);
					}
				}, 100L);

				Server.player2c1CStam = Server.player2c1CStam + 5;

				Server.input("AddPlayer2c1Stam 5");
			}
		});

		final JButton p2c1plus10 = new JButton("");
		p2c1plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p2c1plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p2c1plus10.setBorderPainted(false);
		p2c1plus10.setContentAreaFilled(false);
		p2c1plus10.setBounds(510, 250, 40, 20);
		contentPane.add(p2c1plus10);
		p2c1plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c1plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c1plus10.setSelected(false);
					}
				}, 100L);

				Server.player2c1CStam = Server.player2c1CStam + 10;

				Server.input("AddPlayer2c1Stam 10");
			}
		});

		final JButton p2c1minus1 = new JButton("");
		p2c1minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p2c1minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p2c1minus1.setBorderPainted(false);
		p2c1minus1.setContentAreaFilled(false);
		p2c1minus1.setBounds(630, 250, 40, 20);
		contentPane.add(p2c1minus1);
		p2c1minus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c1minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c1minus1.setSelected(false);
					}
				}, 100L);

				Server.player2c1CStam = Server.player2c1CStam - 1;

				Server.input("SubtractPlayer2c1Stam 1");
			}
		});

		final JButton p2c1minus5 = new JButton("");
		p2c1minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p2c1minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p2c1minus5.setBorderPainted(false);
		p2c1minus5.setContentAreaFilled(false);
		p2c1minus5.setBounds(675, 250, 40, 20);
		contentPane.add(p2c1minus5);
		p2c1minus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c1minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c1minus5.setSelected(false);
					}
				}, 100L);

				Server.player2c1CStam = Server.player2c1CStam - 5;

				Server.input("SubtractPlayer2c1Stam 5");
			}
		});

		final JButton p2c1minus10 = new JButton("");
		p2c1minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p2c1minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p2c1minus10.setBorderPainted(false);
		p2c1minus10.setContentAreaFilled(false);
		p2c1minus10.setBounds(720, 250, 40, 20);
		contentPane.add(p2c1minus10);
		p2c1minus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c1minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c1minus10.setSelected(false);
					}
				}, 100L);

				Server.player2c1CStam = Server.player2c1CStam - 10;

				Server.input("SubtractPlayer2c1Stam 10");
			}
		});

		JLabel p2c2lbl = new JLabel("Companion 2");
		p2c2lbl.setHorizontalAlignment(SwingConstants.CENTER);
		p2c2lbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p2c2lbl.setBounds(550, 280, 80, 20);
		contentPane.add(p2c2lbl);

		p2c2Stam = new JTextField("10/10");
		p2c2Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p2c2Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p2c2Stam.setEditable(false);
		p2c2Stam.setBounds(555, 305, 70, 30);
		contentPane.add(p2c2Stam);

		final JButton p2c2plus1 = new JButton("");
		p2c2plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p2c2plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p2c2plus1.setBorderPainted(false);
		p2c2plus1.setContentAreaFilled(false);
		p2c2plus1.setBounds(420, 310, 40, 20);
		contentPane.add(p2c2plus1);
		p2c2plus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c2plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c2plus1.setSelected(false);
					}
				}, 100L);

				Server.player2c2CStam = Server.player2c2CStam + 1;

				Server.input("AddPlayer2c2Stam 1");
			}
		});

		final JButton p2c2plus5 = new JButton("");
		p2c2plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p2c2plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p2c2plus5.setBorderPainted(false);
		p2c2plus5.setContentAreaFilled(false);
		p2c2plus5.setBounds(465, 310, 40, 20);
		contentPane.add(p2c2plus5);
		p2c2plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c2plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c2plus5.setSelected(false);
					}
				}, 100L);

				Server.player2c2CStam = Server.player2c2CStam + 5;

				Server.input("AddPlayer2c2Stam 5");
			}
		});

		final JButton p2c2plus10 = new JButton("");
		p2c2plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p2c2plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p2c2plus10.setBorderPainted(false);
		p2c2plus10.setContentAreaFilled(false);
		p2c2plus10.setBounds(510, 310, 40, 20);
		contentPane.add(p2c2plus10);
		p2c2plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c2plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c2plus10.setSelected(false);
					}
				}, 100L);

				Server.player2c2CStam = Server.player2c2CStam + 10;

				Server.input("AddPlayer2c2Stam 10");
			}
		});

		final JButton p2c2minus1 = new JButton("");
		p2c2minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p2c2minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p2c2minus1.setBorderPainted(false);
		p2c2minus1.setContentAreaFilled(false);
		p2c2minus1.setBounds(630, 310, 40, 20);
		contentPane.add(p2c2minus1);
		p2c2minus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c2minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c2minus1.setSelected(false);
					}
				}, 100L);

				Server.player2c2CStam = Server.player2c2CStam - 1;

				Server.input("SubtractPlayer2c2Stam 1");
			}
		});

		final JButton p2c2minus5 = new JButton("");
		p2c2minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p2c2minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p2c2minus5.setBorderPainted(false);
		p2c2minus5.setContentAreaFilled(false);
		p2c2minus5.setBounds(675, 310, 40, 20);
		contentPane.add(p2c2minus5);
		p2c2minus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c2minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c2minus5.setSelected(false);
					}
				}, 100L);

				Server.player2c2CStam = Server.player2c2CStam - 5;

				Server.input("SubtractPlayer2c2Stam 5");
			}
		});

		final JButton p2c2minus10 = new JButton("");
		p2c2minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p2c2minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p2c2minus10.setBorderPainted(false);
		p2c2minus10.setContentAreaFilled(false);
		p2c2minus10.setBounds(720, 310, 40, 20);
		contentPane.add(p2c2minus10);
		p2c2minus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p2c2minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p2c2minus10.setSelected(false);
					}
				}, 100L);

				Server.player2c2CStam = Server.player2c2CStam - 10;

				Server.input("SubtractPlayer2c2Stam 10");
			}
		});

		player2Action1.setBorder(null);
		player2Action1.setContentAreaFilled(false);
		player2Action1.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/move.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player2Action1.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player2Action1.setBounds(410, 340, 60, 60);
		contentPane.add(player2Action1);
		player2Action1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player2Action1.isSelected())
				{
					player2Action1.setSelected(false);
					Server.player2Action1 = true;
					Server.input("AddPlayer2Action1");
				} else
				{
					player2Action1.setSelected(true);
					Server.player2Action1 = false;
					Server.input("RemovePlayer2Action1");
				}
			}
		});

		JLabel slotplayer2Action1 = new JLabel();
		slotplayer2Action1.setBorder(null);
		slotplayer2Action1.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotplayer2Action1.setBounds(410, 340, 60, 60);
		contentPane.add(slotplayer2Action1);

		player2Action2.setBorder(null);
		player2Action2.setContentAreaFilled(false);
		player2Action2.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/action.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player2Action2.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player2Action2.setBounds(455, 340, 60, 60);
		contentPane.add(player2Action2);
		player2Action2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player2Action2.isSelected())
				{
					player2Action2.setSelected(false);
					Server.player2Action2 = true;
					Server.input("AddPlayer2Action2");
				} else
				{
					player2Action2.setSelected(true);
					Server.player2Action2 = false;
					Server.input("RemovePlayer2Action2");
				}
			}
		});

		JLabel slotplayer2Action2 = new JLabel();
		slotplayer2Action2.setBorder(null);
		slotplayer2Action2.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotplayer2Action2.setBounds(455, 340, 60, 60);
		contentPane.add(slotplayer2Action2);

		player2Action3.setBorder(null);
		player2Action3.setContentAreaFilled(false);
		player2Action3.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player2Action3.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player2Action3.setBounds(500, 340, 60, 60);
		contentPane.add(player2Action3);
		player2Action3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player2Action3.isSelected())
				{
					player2Action3.setSelected(false);
					Server.player2Action3 = true;
					Server.input("AddPlayer2Action3");
				} else
				{
					player2Action3.setSelected(true);
					Server.player2Action3 = false;
					Server.input("RemovePlayer2Action3");
				}
			}
		});

		JLabel slotplayer2Action3 = new JLabel();
		slotplayer2Action3.setBorder(null);
		slotplayer2Action3.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotplayer2Action3.setBounds(500, 340, 60, 60);
		contentPane.add(slotplayer2Action3);

		player2Action4.setBorder(null);
		player2Action4.setContentAreaFilled(false);
		player2Action4.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player2Action4.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player2Action4.setBounds(560, 340, 60, 60);
		contentPane.add(player2Action4);
		player2Action4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player2Action4.isSelected())
				{
					player2Action4.setSelected(false);
					Server.player2Action4 = true;
					Server.input("AddPlayer2Action4");
				} else
				{
					player2Action4.setSelected(true);
					Server.player2Action4 = false;
					Server.input("RemovePlayer2Action4");
				}
			}
		});

		JLabel slotplayer2Action4 = new JLabel();
		slotplayer2Action4.setBorder(null);
		slotplayer2Action4.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotplayer2Action4.setBounds(560, 340, 60, 60);
		contentPane.add(slotplayer2Action4);

		player2Action5.setBorder(null);
		player2Action5.setContentAreaFilled(false);
		player2Action5.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player2Action5.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player2Action5.setBounds(620, 340, 60, 60);
		contentPane.add(player2Action5);
		player2Action5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player2Action5.isSelected())
				{
					player2Action5.setSelected(false);
					Server.player2Action5 = true;
					Server.input("AddPlayer2Action5");
				} else
				{
					player2Action5.setSelected(true);
					Server.player2Action5 = false;
					Server.input("RemovePlayer2Action5");
				}
			}
		});

		JLabel slotplayer2Action5 = new JLabel();
		slotplayer2Action5.setBorder(null);
		slotplayer2Action5.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotplayer2Action5.setBounds(620, 340, 60, 60);
		contentPane.add(slotplayer2Action5);

		JLabel lblP3 = new JLabel("Player 3 Options");
		lblP3.setHorizontalAlignment(SwingConstants.CENTER);
		lblP3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblP3.setBounds(125, 460, 110, 30);
		contentPane.add(lblP3);

		p3Name = new JTextField();
		p3Name.setBackground(new Color(211, 186, 146));
		p3Name.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(62, 47, 28)));
		p3Name.setBounds(245, 465, 86, 20);
		contentPane.add(p3Name);

		p3Stam = new JTextField("10/10");
		p3Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p3Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p3Stam.setEditable(false);
		p3Stam.setBounds(145, 495, 70, 30);
		contentPane.add(p3Stam);

		final JButton p3plus1 = new JButton("");
		p3plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p3plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p3plus1.setContentAreaFilled(false);
		p3plus1.setBorderPainted(false);
		p3plus1.setBounds(10, 500, 40, 20);
		contentPane.add(p3plus1);
		p3plus1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3plus1.setSelected(false);
					}
				}, 100L);

				Server.player3CStam = Server.player3CStam + 1;

				Server.input("Player3Add 1");
			}
		});

		final JButton p3minus1 = new JButton("");
		p3minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p3minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p3minus1.setContentAreaFilled(false);
		p3minus1.setBorderPainted(false);
		p3minus1.setBounds(220, 500, 40, 20);
		contentPane.add(p3minus1);
		p3minus1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3minus1.setSelected(false);
					}
				}, 100L);

				Server.player3CStam = Server.player3CStam - 1;

				Server.input("Player3Subtract 1");
			}
		});

		final JButton p3plus5 = new JButton("");
		p3plus5.setBackground(new Color(240, 240, 240));
		p3plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p3plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p3plus5.setContentAreaFilled(false);
		p3plus5.setBorderPainted(false);
		p3plus5.setBounds(55, 500, 40, 20);
		contentPane.add(p3plus5);
		p3plus5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3plus5.setSelected(false);
					}
				}, 100L);

				Server.player3CStam = Server.player3CStam + 5;

				Server.input("Player3Add 5");
			}
		});

		final JButton p3minus5 = new JButton("");
		p3minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p3minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p3minus5.setContentAreaFilled(false);
		p3minus5.setBorderPainted(false);
		p3minus5.setBounds(265, 500, 40, 20);
		contentPane.add(p3minus5);
		p3minus5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3minus5.setSelected(false);
					}
				}, 100L);

				Server.player3CStam = Server.player3CStam - 5;

				Server.input("Player3Subtract 5");
			}
		});

		final JButton p3plus10 = new JButton("");
		p3plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p3plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p3plus10.setContentAreaFilled(false);
		p3plus10.setBorderPainted(false);
		p3plus10.setBounds(100, 500, 40, 20);
		contentPane.add(p3plus10);
		p3plus10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3plus10.setSelected(false);
					}
				}, 100L);

				Server.player3CStam = Server.player3CStam + 10;

				Server.input("Player3Add 10");
			}
		});

		final JButton p3minus10 = new JButton("");
		p3minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p3minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p3minus10.setContentAreaFilled(false);
		p3minus10.setBorderPainted(false);
		p3minus10.setBounds(310, 500, 40, 20);
		contentPane.add(p3minus10);
		p3minus10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3minus10.setSelected(false);
					}
				}, 100L);

				Server.player3CStam = Server.player3CStam - 10;

				Server.input("Player3Subtract 10");
			}
		});

		JLabel p3Goldlbl = new JLabel("Gold");
		p3Goldlbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p3Goldlbl.setHorizontalAlignment(SwingConstants.CENTER);
		p3Goldlbl.setBounds(145, 530, 70, 20);
		contentPane.add(p3Goldlbl);

		p3Gold = new JTextField("0");
		p3Gold.setHorizontalAlignment(SwingConstants.CENTER);
		p3Gold.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p3Gold.setEditable(false);
		p3Gold.setBounds(145, 555, 70, 30);
		contentPane.add(p3Gold);

		final JButton p3plus10gold = new JButton("");
		p3plus10gold.setBorderPainted(false);
		p3plus10gold.setContentAreaFilled(false);
		p3plus10gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10+.png")));
		p3plus10gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10+p.jpg")));
		p3plus10gold.setBounds(10, 560, 40, 20);
		contentPane.add(p3plus10gold);
		p3plus10gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3plus10gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3plus10gold.setSelected(false);
					}
				}, 100L);

				Server.player3Gold += +10;
				Server.input("AddPlayer3Gold 10");
			}
		});

		final JButton p3minus10gold = new JButton("");
		p3minus10gold.setBorderPainted(false);
		p3minus10gold.setContentAreaFilled(false);
		p3minus10gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10-.png")));
		p3minus10gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10-p.jpg")));
		p3minus10gold.setBounds(220, 560, 40, 20);
		contentPane.add(p3minus10gold);
		p3minus10gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3minus10gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3minus10gold.setSelected(false);
					}
				}, 100L);

				Server.player3Gold -= 10;
				Server.input("SubtractPlayer3Gold 10");
			}
		});

		final JButton p3plus100gold = new JButton("");
		p3plus100gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100+.jpg")));
		p3plus100gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100+p.jpg")));
		p3plus100gold.setContentAreaFilled(false);
		p3plus100gold.setBorderPainted(false);
		p3plus100gold.setBounds(55, 560, 40, 20);
		contentPane.add(p3plus100gold);
		p3plus100gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3plus100gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3plus100gold.setSelected(false);
					}
				}, 100L);

				Server.player3Gold = Server.player3Gold + 100;
				Server.input("AddPlayer3Gold 100");
			}
		});

		final JButton p3minus100gold = new JButton("");
		p3minus100gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100-.jpg")));
		p3minus100gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100-p.jpg")));
		p3minus100gold.setContentAreaFilled(false);
		p3minus100gold.setBorderPainted(false);
		p3minus100gold.setBounds(265, 560, 40, 20);
		contentPane.add(p3minus100gold);
		p3minus100gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3minus100gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3minus100gold.setSelected(false);
					}
				}, 100L);

				Server.player3Gold = Server.player3Gold - 100;
				Server.input("SubtractPlayer3Gold 100");
			}
		});

		final JButton p3plus500gold = new JButton("");
		p3plus500gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500+.jpg")));
		p3plus500gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500+p.jpg")));
		p3plus500gold.setContentAreaFilled(false);
		p3plus500gold.setBorderPainted(false);
		p3plus500gold.setBounds(100, 560, 40, 20);
		contentPane.add(p3plus500gold);
		p3plus500gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3plus500gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3plus500gold.setSelected(false);
					}
				}, 100L);

				Server.player3Gold = Server.player3Gold + 500;
				Server.input("AddPlayer3Gold 500");
			}
		});

		final JButton p3minus500gold = new JButton("");
		p3minus500gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500-.jpg")));
		p3minus500gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500-p.jpg")));
		p3minus500gold.setContentAreaFilled(false);
		p3minus500gold.setBorderPainted(false);
		p3minus500gold.setBounds(310, 560, 40, 20);
		contentPane.add(p3minus500gold);
		p3minus500gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p3minus500gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3minus500gold.setSelected(false);
					}
				}, 100L);

				Server.player3Gold = Server.player3Gold - 500;
				Server.input("SubtractPlayer3Gold 500");
			}
		});

		JLabel p3c1lbl = new JLabel("Companion 1");
		p3c1lbl.setHorizontalAlignment(SwingConstants.CENTER);
		p3c1lbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p3c1lbl.setBounds(140, 590, 80, 20);
		contentPane.add(p3c1lbl);

		p3c1Stam = new JTextField("10/10");
		p3c1Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p3c1Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p3c1Stam.setEditable(false);
		p3c1Stam.setBounds(145, 615, 70, 30);
		contentPane.add(p3c1Stam);

		final JButton p3c1plus1 = new JButton("");
		p3c1plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p3c1plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p3c1plus1.setBorderPainted(false);
		p3c1plus1.setContentAreaFilled(false);
		p3c1plus1.setBounds(10, 620, 40, 20);
		contentPane.add(p3c1plus1);
		p3c1plus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c1plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c1plus1.setSelected(false);
					}
				}, 100L);

				Server.player3c1CStam = Server.player3c1CStam + 1;

				Server.input("AddPlayer3c1Stam 1");
			}
		});

		final JButton p3c1plus5 = new JButton("");
		p3c1plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p3c1plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p3c1plus5.setBorderPainted(false);
		p3c1plus5.setContentAreaFilled(false);
		p3c1plus5.setBounds(55, 620, 40, 20);
		contentPane.add(p3c1plus5);
		p3c1plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c1plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c1plus5.setSelected(false);
					}
				}, 100L);

				Server.player3c1CStam = Server.player3c1CStam + 5;

				Server.input("AddPlayer3c1Stam 5");
			}
		});

		final JButton p3c1plus10 = new JButton("");
		p3c1plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p3c1plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p3c1plus10.setBorderPainted(false);
		p3c1plus10.setContentAreaFilled(false);
		p3c1plus10.setBounds(100, 620, 40, 20);
		contentPane.add(p3c1plus10);
		p3c1plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c1plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c1plus10.setSelected(false);
					}
				}, 100L);

				Server.player3c1CStam = Server.player3c1CStam + 10;

				Server.input("AddPlayer3c1Stam 10");
			}
		});

		final JButton p3c1minus1 = new JButton("");
		p3c1minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p3c1minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p3c1minus1.setBorderPainted(false);
		p3c1minus1.setContentAreaFilled(false);
		p3c1minus1.setBounds(220, 620, 40, 20);
		contentPane.add(p3c1minus1);
		p3c1minus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c1minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c1minus1.setSelected(false);
					}
				}, 100L);

				Server.player3c1CStam = Server.player3c1CStam - 1;

				Server.input("SubtractPlayer3c1Stam 1");
			}
		});

		final JButton p3c1minus5 = new JButton("");
		p3c1minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p3c1minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p3c1minus5.setBorderPainted(false);
		p3c1minus5.setContentAreaFilled(false);
		p3c1minus5.setBounds(265, 620, 40, 20);
		contentPane.add(p3c1minus5);
		p3c1minus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c1minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c1minus5.setSelected(false);
					}
				}, 100L);

				Server.player3c1CStam = Server.player3c1CStam - 5;

				Server.input("SubtractPlayer3c1Stam 5");
			}
		});

		final JButton p3c1minus10 = new JButton("");
		p3c1minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p3c1minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p3c1minus10.setBorderPainted(false);
		p3c1minus10.setContentAreaFilled(false);
		p3c1minus10.setBounds(310, 620, 40, 20);
		contentPane.add(p3c1minus10);
		p3c1minus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c1minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c1minus10.setSelected(false);
					}
				}, 100L);

				Server.player3c1CStam = Server.player3c1CStam - 10;

				Server.input("SubtractPlayer3c1Stam 10");
			}
		});

		JLabel p3c2lbl = new JLabel("Companion 2");
		p3c2lbl.setHorizontalAlignment(SwingConstants.CENTER);
		p3c2lbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p3c2lbl.setBounds(140, 650, 80, 20);
		contentPane.add(p3c2lbl);

		p3c2Stam = new JTextField("10/10");
		p3c2Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p3c2Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p3c2Stam.setEditable(false);
		p3c2Stam.setBounds(145, 675, 70, 30);
		contentPane.add(p3c2Stam);

		final JButton p3c2plus1 = new JButton("");
		p3c2plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p3c2plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p3c2plus1.setBorderPainted(false);
		p3c2plus1.setContentAreaFilled(false);
		p3c2plus1.setBounds(10, 680, 40, 20);
		contentPane.add(p3c2plus1);
		p3c2plus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c2plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c2plus1.setSelected(false);
					}
				}, 100L);

				Server.player3c2CStam = Server.player3c2CStam + 1;

				Server.input("AddPlayer3c2Stam 1");
			}
		});

		final JButton p3c2plus5 = new JButton("");
		p3c2plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p3c2plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p3c2plus5.setBorderPainted(false);
		p3c2plus5.setContentAreaFilled(false);
		p3c2plus5.setBounds(55, 680, 40, 20);
		contentPane.add(p3c2plus5);
		p3c2plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c2plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c2plus5.setSelected(false);
					}
				}, 100L);

				Server.player3c2CStam = Server.player3c2CStam + 5;

				Server.input("AddPlayer3c2Stam 5");
			}
		});

		final JButton p3c2plus10 = new JButton("");
		p3c2plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p3c2plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p3c2plus10.setBorderPainted(false);
		p3c2plus10.setContentAreaFilled(false);
		p3c2plus10.setBounds(100, 680, 40, 20);
		contentPane.add(p3c2plus10);
		p3c2plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c2plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c2plus10.setSelected(false);
					}
				}, 100L);

				Server.player3c2CStam = Server.player3c2CStam + 10;

				Server.input("AddPlayer3c2Stam 10");
			}
		});

		final JButton p3c2minus1 = new JButton("");
		p3c2minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p3c2minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p3c2minus1.setBorderPainted(false);
		p3c2minus1.setContentAreaFilled(false);
		p3c2minus1.setBounds(220, 680, 40, 20);
		contentPane.add(p3c2minus1);
		p3c2minus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c2minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c2minus1.setSelected(false);
					}
				}, 100L);

				Server.player3c2CStam = Server.player3c2CStam - 1;

				Server.input("SubtractPlayer3c2Stam 1");
			}
		});

		final JButton p3c2minus5 = new JButton("");
		p3c2minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p3c2minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p3c2minus5.setBorderPainted(false);
		p3c2minus5.setContentAreaFilled(false);
		p3c2minus5.setBounds(265, 680, 40, 20);
		contentPane.add(p3c2minus5);
		p3c2minus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c2minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c2minus5.setSelected(false);
					}
				}, 100L);

				Server.player3c2CStam = Server.player3c2CStam - 5;

				Server.input("SubtractPlayer3c2Stam 5");
			}
		});

		final JButton p3c2minus10 = new JButton("");
		p3c2minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p3c2minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p3c2minus10.setBorderPainted(false);
		p3c2minus10.setContentAreaFilled(false);
		p3c2minus10.setBounds(310, 680, 40, 20);
		contentPane.add(p3c2minus10);
		p3c2minus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p3c2minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p3c2minus10.setSelected(false);
					}
				}, 100L);

				Server.player3c2CStam = Server.player3c2CStam - 10;

				Server.input("SubtractPlayer3c2Stam 10");
			}
		});

		player3Action1.setBorder(null);
		player3Action1.setContentAreaFilled(false);
		player3Action1.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/move.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player3Action1.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player3Action1.setBounds(0, 710, 60, 60);
		contentPane.add(player3Action1);
		player3Action1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player3Action1.isSelected())
				{
					player3Action1.setSelected(false);
					Server.player3Action1 = true;
					Server.input("AddPlayer3Action1");
				} else
				{
					player3Action1.setSelected(true);
					Server.player3Action1 = false;
					Server.input("RemovePlayer3Action1");
				}
			}
		});

		JLabel slotPlayer3Action1 = new JLabel();
		slotPlayer3Action1.setBorder(null);
		slotPlayer3Action1.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer3Action1.setBounds(0, 710, 60, 60);
		contentPane.add(slotPlayer3Action1);

		player3Action2.setBorder(null);
		player3Action2.setContentAreaFilled(false);
		player3Action2.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/action.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player3Action2.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player3Action2.setBounds(45, 710, 60, 60);
		contentPane.add(player3Action2);
		player3Action2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player3Action2.isSelected())
				{
					player3Action2.setSelected(false);
					Server.player3Action2 = true;
					Server.input("AddPlayer3Action2");
				} else
				{
					player3Action2.setSelected(true);
					Server.player3Action2 = false;
					Server.input("RemovePlayer3Action2");
				}
			}
		});

		JLabel slotPlayer3Action2 = new JLabel();
		slotPlayer3Action2.setBorder(null);
		slotPlayer3Action2.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer3Action2.setBounds(45, 710, 60, 60);
		contentPane.add(slotPlayer3Action2);

		player3Action3.setBorder(null);
		player3Action3.setContentAreaFilled(false);
		player3Action3.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player3Action3.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player3Action3.setBounds(90, 710, 60, 60);
		contentPane.add(player3Action3);
		player3Action3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player3Action3.isSelected())
				{
					player3Action3.setSelected(false);
					Server.player3Action3 = true;
					Server.input("AddPlayer3Action3");
				} else
				{
					player3Action3.setSelected(true);
					Server.player3Action3 = false;
					Server.input("RemovePlayer3Action3");
				}
			}
		});

		JLabel slotPlayer3Action3 = new JLabel();
		slotPlayer3Action3.setBorder(null);
		slotPlayer3Action3.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer3Action3.setBounds(90, 710, 60, 60);
		contentPane.add(slotPlayer3Action3);

		player3Action4.setBorder(null);
		player3Action4.setContentAreaFilled(false);
		player3Action4.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player3Action4.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player3Action4.setBounds(150, 710, 60, 60);
		contentPane.add(player3Action4);
		player3Action4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player3Action4.isSelected())
				{
					player3Action4.setSelected(false);
					Server.player3Action4 = true;
					Server.input("AddPlayer3Action4");
				} else
				{
					player3Action4.setSelected(true);
					Server.player3Action4 = false;
					Server.input("RemovePlayer3Action4");
				}
			}
		});

		JLabel slotPlayer3Action4 = new JLabel();
		slotPlayer3Action4.setBorder(null);
		slotPlayer3Action4.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer3Action4.setBounds(150, 710, 60, 60);
		contentPane.add(slotPlayer3Action4);

		player3Action5.setBorder(null);
		player3Action5.setContentAreaFilled(false);
		player3Action5.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player3Action5.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player3Action5.setBounds(210, 710, 60, 60);
		contentPane.add(player3Action5);
		player3Action5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player3Action5.isSelected())
				{
					player3Action5.setSelected(false);
					Server.player3Action5 = true;
					Server.input("AddPlayer3Action5");
				} else
				{
					player3Action5.setSelected(true);
					Server.player3Action5 = false;
					Server.input("RemovePlayer3Action5");
				}
			}
		});

		JLabel slotPlayer3Action5 = new JLabel();
		slotPlayer3Action5.setBorder(null);
		slotPlayer3Action5.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotPlayer3Action5.setBounds(210, 710, 60, 60);
		contentPane.add(slotPlayer3Action5);

		JLabel lblP4 = new JLabel("Player 4 Options");
		lblP4.setHorizontalAlignment(SwingConstants.CENTER);
		lblP4.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblP4.setBounds(535, 460, 110, 30);
		contentPane.add(lblP4);

		p4Name = new JTextField();
		p4Name.setBackground(new Color(211, 186, 146));
		p4Name.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(62, 47, 28)));
		p4Name.setBounds(655, 465, 86, 20);
		contentPane.add(p4Name);

		p4Stam = new JTextField("10/10");
		p4Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p4Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p4Stam.setEditable(false);
		p4Stam.setBounds(555, 495, 70, 30);
		contentPane.add(p4Stam);

		final JButton p4plus1 = new JButton("");
		p4plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p4plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p4plus1.setContentAreaFilled(false);
		p4plus1.setBorderPainted(false);
		p4plus1.setBounds(420, 500, 40, 20);
		contentPane.add(p4plus1);
		p4plus1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4plus1.setSelected(false);
					}
				}, 100L);

				Server.player4CStam = Server.player4CStam + 1;

				Server.input("Player4Add 1");
			}
		});

		final JButton p4minus1 = new JButton("");
		p4minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p4minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p4minus1.setContentAreaFilled(false);
		p4minus1.setBorderPainted(false);
		p4minus1.setBounds(630, 500, 40, 20);
		contentPane.add(p4minus1);
		p4minus1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4minus1.setSelected(false);
					}
				}, 100L);

				Server.player4CStam = Server.player4CStam - 1;

				Server.input("Player4Subtract 1");
			}
		});

		final JButton p4plus5 = new JButton("");
		p4plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p4plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p4plus5.setContentAreaFilled(false);
		p4plus5.setBorderPainted(false);
		p4plus5.setBounds(465, 500, 40, 20);
		contentPane.add(p4plus5);
		p4plus5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4plus5.setSelected(false);
					}
				}, 100L);

				Server.player4CStam = Server.player4CStam + 5;

				Server.input("Player4Add 5");
			}
		});

		final JButton p4minus5 = new JButton("");
		p4minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p4minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p4minus5.setContentAreaFilled(false);
		p4minus5.setBorderPainted(false);
		p4minus5.setBounds(675, 500, 40, 20);
		contentPane.add(p4minus5);
		p4minus5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4minus5.setSelected(false);
					}
				}, 100L);

				Server.player4CStam = Server.player4CStam - 5;

				Server.input("Player4Subtract 5");
			}
		});

		final JButton p4plus10 = new JButton("");
		p4plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p4plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p4plus10.setContentAreaFilled(false);
		p4plus10.setBorderPainted(false);
		p4plus10.setBounds(510, 500, 40, 20);
		contentPane.add(p4plus10);
		p4plus10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4plus10.setSelected(false);
					}
				}, 100L);

				Server.player4CStam = Server.player4CStam + 10;

				Server.input("Player4Add 10");
			}
		});

		final JButton p4minus10 = new JButton("");
		p4minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p4minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p4minus10.setContentAreaFilled(false);
		p4minus10.setBorderPainted(false);
		p4minus10.setBounds(720, 500, 40, 20);
		contentPane.add(p4minus10);
		p4minus10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4minus10.setSelected(false);
					}
				}, 100L);

				Server.player4CStam = Server.player4CStam - 10;

				Server.input("Player4Subtract 10");
			}
		});

		JLabel p4Goldlbl = new JLabel("Gold");
		p4Goldlbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p4Goldlbl.setHorizontalAlignment(SwingConstants.CENTER);
		p4Goldlbl.setBounds(555, 530, 70, 20);
		contentPane.add(p4Goldlbl);

		p4Gold = new JTextField("0");
		p4Gold.setHorizontalAlignment(SwingConstants.CENTER);
		p4Gold.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p4Gold.setEditable(false);
		p4Gold.setBounds(555, 555, 70, 30);
		contentPane.add(p4Gold);

		final JButton p4plus10gold = new JButton("");
		p4plus10gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10+.png")));
		p4plus10gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10+p.jpg")));
		p4plus10gold.setContentAreaFilled(false);
		p4plus10gold.setBorderPainted(false);
		p4plus10gold.setBounds(420, 560, 40, 20);
		contentPane.add(p4plus10gold);
		p4plus10gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4plus10gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4plus10gold.setSelected(false);
					}
				}, 100L);

				Server.player4Gold = Server.player4Gold + 10;
				Server.input("AddPlayer4Gold 10");
			}
		});

		final JButton p4minus10gold = new JButton("");
		p4minus10gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10-.png")));
		p4minus10gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/10-p.jpg")));
		p4minus10gold.setContentAreaFilled(false);
		p4minus10gold.setBorderPainted(false);
		p4minus10gold.setBounds(630, 560, 40, 20);
		contentPane.add(p4minus10gold);
		p4minus10gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4minus10gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4minus10gold.setSelected(false);
					}
				}, 100L);

				Server.player4Gold = Server.player4Gold - 10;
				Server.input("SubtractPlayer4Gold 10");
			}
		});

		final JButton p4plus100gold = new JButton("");
		p4plus100gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100+.jpg")));
		p4plus100gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100+p.jpg")));
		p4plus100gold.setContentAreaFilled(false);
		p4plus100gold.setBorderPainted(false);
		p4plus100gold.setBounds(465, 560, 40, 20);
		contentPane.add(p4plus100gold);
		p4plus100gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4plus100gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4plus100gold.setSelected(false);
					}
				}, 100L);

				Server.player4Gold = Server.player4Gold + 100;
				Server.input("AddPlayer4Gold 100");
			}
		});

		final JButton p4minus100gold = new JButton("");
		p4minus100gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100-.jpg")));
		p4minus100gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/100-p.jpg")));
		p4minus100gold.setContentAreaFilled(false);
		p4minus100gold.setBorderPainted(false);
		p4minus100gold.setBounds(675, 560, 40, 20);
		contentPane.add(p4minus100gold);
		p4minus100gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4minus100gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4minus100gold.setSelected(false);
					}
				}, 100L);

				Server.player4Gold = Server.player4Gold - 100;
				Server.input("SubtractPlayer4Gold 100");
			}
		});

		final JButton p4plus500gold = new JButton("");
		p4plus500gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500+.jpg")));
		p4plus500gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500+p.jpg")));
		p4plus500gold.setContentAreaFilled(false);
		p4plus500gold.setBorderPainted(false);
		p4plus500gold.setBounds(510, 560, 40, 20);
		contentPane.add(p4plus500gold);
		p4plus500gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4plus500gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4plus500gold.setSelected(false);
					}
				}, 100L);

				Server.player4Gold = Server.player4Gold + 500;
				Server.input("AddPlayer4Gold 500");
			}
		});

		final JButton p4minus500gold = new JButton("");
		p4minus500gold.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500-.jpg")));
		p4minus500gold.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Gold/500-p.jpg")));
		p4minus500gold.setContentAreaFilled(false);
		p4minus500gold.setBorderPainted(false);
		p4minus500gold.setBounds(720, 560, 40, 20);
		contentPane.add(p4minus500gold);
		p4minus500gold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				p4minus500gold.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4minus500gold.setSelected(false);
					}
				}, 100L);
				Server.player4Gold = Server.player4Gold - 500;
				Server.input("SubtractPlayer4Gold 500");
			}
		});

		JLabel p4c1lbl = new JLabel("Companion 1");
		p4c1lbl.setHorizontalAlignment(SwingConstants.CENTER);
		p4c1lbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p4c1lbl.setBounds(550, 590, 80, 20);
		contentPane.add(p4c1lbl);

		p4c1Stam = new JTextField("10/10");
		p4c1Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p4c1Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p4c1Stam.setEditable(false);
		p4c1Stam.setBounds(555, 615, 70, 30);
		contentPane.add(p4c1Stam);

		final JButton p4c1plus1 = new JButton("");
		p4c1plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p4c1plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p4c1plus1.setBorderPainted(false);
		p4c1plus1.setContentAreaFilled(false);
		p4c1plus1.setBounds(420, 620, 40, 20);
		contentPane.add(p4c1plus1);
		p4c1plus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c1plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c1plus1.setSelected(false);
					}
				}, 100L);

				Server.player4c1CStam = Server.player4c1CStam + 1;

				Server.input("AddPlayer4c1Stam 1");
			}
		});

		final JButton p4c1plus5 = new JButton("");
		p4c1plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p4c1plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p4c1plus5.setBorderPainted(false);
		p4c1plus5.setContentAreaFilled(false);
		p4c1plus5.setBounds(465, 620, 40, 20);
		contentPane.add(p4c1plus5);
		p4c1plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c1plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c1plus5.setSelected(false);
					}
				}, 100L);

				Server.player4c1CStam = Server.player4c1CStam + 5;

				Server.input("AddPlayer4c1Stam 5");
			}
		});

		final JButton p4c1plus10 = new JButton("");
		p4c1plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p4c1plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p4c1plus10.setBorderPainted(false);
		p4c1plus10.setContentAreaFilled(false);
		p4c1plus10.setBounds(510, 620, 40, 20);
		contentPane.add(p4c1plus10);
		p4c1plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c1plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c1plus10.setSelected(false);
					}
				}, 100L);

				Server.player4c1CStam = Server.player4c1CStam + 10;

				Server.input("AddPlayer4c1Stam 10");
			}
		});

		final JButton p4c1minus1 = new JButton("");
		p4c1minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p4c1minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p4c1minus1.setBorderPainted(false);
		p4c1minus1.setContentAreaFilled(false);
		p4c1minus1.setBounds(630, 620, 40, 20);
		contentPane.add(p4c1minus1);
		p4c1minus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c1minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c1minus1.setSelected(false);
					}
				}, 100L);

				Server.player4c1CStam = Server.player4c1CStam - 1;

				Server.input("SubtractPlayer4c1Stam 1");
			}
		});

		final JButton p4c1minus5 = new JButton("");
		p4c1minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p4c1minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p4c1minus5.setBorderPainted(false);
		p4c1minus5.setContentAreaFilled(false);
		p4c1minus5.setBounds(675, 620, 40, 20);
		contentPane.add(p4c1minus5);
		p4c1minus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c1minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c1minus5.setSelected(false);
					}
				}, 100L);

				Server.player4c1CStam = Server.player4c1CStam - 5;

				Server.input("SubtractPlayer4c1Stam 5");
			}
		});

		final JButton p4c1minus10 = new JButton("");
		p4c1minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p4c1minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p4c1minus10.setBorderPainted(false);
		p4c1minus10.setContentAreaFilled(false);
		p4c1minus10.setBounds(720, 620, 40, 20);
		contentPane.add(p4c1minus10);
		p4c1minus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c1minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c1minus10.setSelected(false);
					}
				}, 100L);

				Server.player4c1CStam = Server.player4c1CStam - 10;

				Server.input("SubtractPlayer4c1Stam 10");
			}
		});

		JLabel p4c2lbl = new JLabel("Companion 2");
		p4c2lbl.setHorizontalAlignment(SwingConstants.CENTER);
		p4c2lbl.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p4c2lbl.setBounds(550, 650, 80, 20);
		contentPane.add(p4c2lbl);

		p4c2Stam = new JTextField("10/10");
		p4c2Stam.setHorizontalAlignment(SwingConstants.CENTER);
		p4c2Stam.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		p4c2Stam.setEditable(false);
		p4c2Stam.setBounds(555, 675, 70, 30);
		contentPane.add(p4c2Stam);

		final JButton p4c2plus1 = new JButton("");
		p4c2plus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+p.jpg")));
		p4c2plus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1+.jpg")));
		p4c2plus1.setBorderPainted(false);
		p4c2plus1.setContentAreaFilled(false);
		p4c2plus1.setBounds(420, 680, 40, 20);
		contentPane.add(p4c2plus1);
		p4c2plus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c2plus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c2plus1.setSelected(false);
					}
				}, 100L);

				Server.player4c2CStam = Server.player4c2CStam + 1;

				Server.input("AddPlayer4c2Stam 1");
			}
		});

		final JButton p4c2plus5 = new JButton("");
		p4c2plus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+.jpg")));
		p4c2plus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5+p.jpg")));
		p4c2plus5.setBorderPainted(false);
		p4c2plus5.setContentAreaFilled(false);
		p4c2plus5.setBounds(465, 680, 40, 20);
		contentPane.add(p4c2plus5);
		p4c2plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c2plus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c2plus5.setSelected(false);
					}
				}, 100L);

				Server.player4c2CStam = Server.player4c2CStam + 5;

				Server.input("AddPlayer4c2Stam 5");
			}
		});

		final JButton p4c2plus10 = new JButton("");
		p4c2plus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+.jpg")));
		p4c2plus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10+p.jpg")));
		p4c2plus10.setBorderPainted(false);
		p4c2plus10.setContentAreaFilled(false);
		p4c2plus10.setBounds(510, 680, 40, 20);
		contentPane.add(p4c2plus10);
		p4c2plus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c2plus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c2plus10.setSelected(false);
					}
				}, 100L);

				Server.player4c2CStam = Server.player4c2CStam + 10;

				Server.input("AddPlayer4c2Stam 10");
			}
		});

		final JButton p4c2minus1 = new JButton("");
		p4c2minus1.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-.jpg")));
		p4c2minus1.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/1-p.jpg")));
		p4c2minus1.setBorderPainted(false);
		p4c2minus1.setContentAreaFilled(false);
		p4c2minus1.setBounds(630, 680, 40, 20);
		contentPane.add(p4c2minus1);
		p4c2minus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c2minus1.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c2minus1.setSelected(false);
					}
				}, 100L);

				Server.player4c2CStam = Server.player4c2CStam - 1;

				Server.input("SubtractPlayer4c2Stam 1");
			}
		});

		final JButton p4c2minus5 = new JButton("");
		p4c2minus5.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-.jpg")));
		p4c2minus5.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/5-p.jpg")));
		p4c2minus5.setBorderPainted(false);
		p4c2minus5.setContentAreaFilled(false);
		p4c2minus5.setBounds(675, 680, 40, 20);
		contentPane.add(p4c2minus5);
		p4c2minus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c2minus5.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c2minus5.setSelected(false);
					}
				}, 100L);

				Server.player4c2CStam = Server.player4c2CStam - 5;

				Server.input("SubtractPlayer4c2Stam 5");
			}
		});

		final JButton p4c2minus10 = new JButton("");
		p4c2minus10.setIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-.jpg")));
		p4c2minus10.setSelectedIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/Stamina/10-p.jpg")));
		p4c2minus10.setBorderPainted(false);
		p4c2minus10.setContentAreaFilled(false);
		p4c2minus10.setBounds(720, 680, 40, 20);
		contentPane.add(p4c2minus10);
		p4c2minus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent paramActionEvent)
			{
				p4c2minus10.setSelected(true);
				timer.schedule(new TimerTask() {

					@Override
					public void run()
					{
						p4c2minus10.setSelected(false);
					}
				}, 100L);

				Server.player4c2CStam = Server.player4c2CStam - 10;

				Server.input("SubtractPlayer4c2Stam 10");
			}
		});

		player4Action1.setBorder(null);
		player4Action1.setContentAreaFilled(false);
		player4Action1.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/move.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player4Action1.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player4Action1.setBounds(400, 710, 60, 60);
		contentPane.add(player4Action1);
		player4Action1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player4Action1.isSelected())
				{
					player4Action1.setSelected(false);
					Server.player4Action1 = true;
					Server.input("AddPlayer4Action1");
				} else
				{
					player4Action1.setSelected(true);
					Server.player4Action1 = false;
					Server.input("RemovePlayer4Action1");
				}
			}
		});

		JLabel slotplayer4Action1 = new JLabel();
		slotplayer4Action1.setBorder(null);
		slotplayer4Action1.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotplayer4Action1.setBounds(400, 710, 60, 60);
		contentPane.add(slotplayer4Action1);

		player4Action2.setBorder(null);
		player4Action2.setContentAreaFilled(false);
		player4Action2.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/action.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player4Action2.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player4Action2.setBounds(450, 710, 60, 60);
		contentPane.add(player4Action2);
		player4Action2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player4Action2.isSelected())
				{
					player4Action2.setSelected(false);
					Server.player4Action2 = true;
					Server.input("AddPlayer4Action2");
				} else
				{
					player4Action2.setSelected(true);
					Server.player4Action2 = false;
					Server.input("RemovePlayer4Action2");
				}
			}
		});

		JLabel slotplayer4Action2 = new JLabel();
		slotplayer4Action2.setBorder(null);
		slotplayer4Action2.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotplayer4Action2.setBounds(450, 710, 60, 60);
		contentPane.add(slotplayer4Action2);

		player4Action3.setBorder(null);
		player4Action3.setContentAreaFilled(false);
		player4Action3.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player4Action3.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player4Action3.setBounds(500, 710, 60, 60);
		contentPane.add(player4Action3);
		player4Action3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player4Action3.isSelected())
				{
					player4Action3.setSelected(false);
					Server.player4Action3 = true;
					Server.input("AddPlayer4Action3");
				} else
				{
					player4Action3.setSelected(true);
					Server.player4Action3 = false;
					Server.input("RemovePlayer4Action3");
				}
			}
		});

		JLabel slotplayer4Action3 = new JLabel();
		slotplayer4Action3.setBorder(null);
		slotplayer4Action3.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotplayer4Action3.setBounds(500, 710, 60, 60);
		contentPane.add(slotplayer4Action3);

		player4Action4.setBorder(null);
		player4Action4.setContentAreaFilled(false);
		player4Action4.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player4Action4.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player4Action4.setBounds(560, 710, 60, 60);
		contentPane.add(player4Action4);
		player4Action4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player4Action4.isSelected())
				{
					player4Action4.setSelected(false);
					Server.player4Action4 = true;
					Server.input("AddPlayer4Action4");
				} else
				{
					player4Action4.setSelected(true);
					Server.player4Action4 = false;
					Server.input("RemovePlayer4Action4");
				}
			}
		});

		JLabel slotplayer4Action4 = new JLabel();
		slotplayer4Action4.setBorder(null);
		slotplayer4Action4.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotplayer4Action4.setBounds(560, 710, 60, 60);
		contentPane.add(slotplayer4Action4);

		player4Action5.setBorder(null);
		player4Action5.setContentAreaFilled(false);
		player4Action5.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/anytime.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		player4Action5.setSelectedIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/null.png")).getImage()));
		player4Action5.setBounds(620, 710, 60, 60);
		contentPane.add(player4Action5);
		player4Action5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if (player4Action5.isSelected())
				{
					player4Action5.setSelected(false);
					Server.player4Action5 = true;
					Server.input("AddPlayer4Action5");
				} else
				{
					player4Action5.setSelected(true);
					Server.player4Action5 = false;
					Server.input("RemovePlayer4Action5");
				}
			}
		});

		JLabel slotplayer4Action5 = new JLabel();
		slotplayer4Action5.setBorder(null);
		slotplayer4Action5.setIcon(new ImageIcon(new ImageIcon(UI.class
				.getResource("/resources/UI/slot.png")).getImage().getScaledInstance(60, 60,
				Image.SCALE_SMOOTH)));
		slotplayer4Action5.setBounds(620, 710, 60, 60);
		contentPane.add(slotplayer4Action5);

		JLabel background = new JLabel();
		background.setBounds(0, 0, 769, 769);
		background.setIcon(new ImageIcon(new ImageIcon(ServerGMUI.class
				.getResource("/resources/GMUI/GMUIBackground.jpg")).getImage().getScaledInstance(
				background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH)));

		/*
		 * ADDING
		 */

		contentPane.add(p1);
		contentPane.add(p2);
		contentPane.add(p3);
		contentPane.add(p4);

		contentPane.add(background);
	}
}
