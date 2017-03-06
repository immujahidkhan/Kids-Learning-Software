package com.bsc.cs.kidssoftware;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;

public class Flowers {
	private JButton[] flowers = new JButton[6];
	private JLabel label = new JLabel("Flowers");
	private String[] names = { "Jasmine", "Lilly", "Lotus", "Rose", "Sunflower", "Tulip"};
	private JLabel lblNewLabel_1 = new JLabel();
	protected static Clip clip;
	private Boolean clipCheck = false;
	
		public Flowers(JPanel flowers_jp){

			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.BLUE);
			label.setFont(new Font("Times New Roman", Font.PLAIN, 34));

			for (int i = 0; i < flowers.length; i++)
					flowers[i] = new JButton(names[i]);
			
			GroupLayout gl_panel_1 = new GroupLayout(flowers_jp);
			gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addGap(60)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addComponent(flowers[0], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addComponent(flowers[1], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addComponent(flowers[2], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(flowers[3], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addComponent(flowers[4], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addComponent(flowers[5], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(496, Short.MAX_VALUE)
						.addContainerGap(50, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup().addContainerGap(201, Short.MAX_VALUE)
								.addComponent(label)
								.addGap(325))
			);
			gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addGap(20)
							.addComponent(label)
						.addContainerGap(115, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(flowers[0], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addComponent(flowers[3], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGap(67)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(flowers[1], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addComponent(flowers[4], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGap(66)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(flowers[2], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addComponent(flowers[5], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(131, Short.MAX_VALUE))
			);
			flowers_jp.setLayout(gl_panel_1);
			
			for (int i = 0; i < flowers.length; i++) {
				
				final int n = i;
			
				flowers[i].addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent ae) {
						try {

							BufferedImage img = ImageIO.read(new File("assets/" + names[n] + ".jpg"));
							Image dimg = img.getScaledInstance(325, 350, Image.SCALE_SMOOTH);
							ImageIcon imageIcon = new ImageIcon(dimg);
							lblNewLabel_1.setIcon(imageIcon);
							gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(370)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
											.addContainerGap(341, Short.MAX_VALUE))
							);
							gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(75)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
											.addContainerGap(150, Short.MAX_VALUE))
							);
							
							new Thread(new Runnable() {

							    @Override
								public void run() {
							      try {
							    	if(clipCheck)
							    		clip.stop();
							        clip = AudioSystem.getClip();							        
							        AudioInputStream inputStream = AudioSystem.getAudioInputStream(Alphabets.class.getResourceAsStream("/assets/Placeholder.wav"));
							        clip.open(inputStream);
							        clip.start(); 
							        clipCheck = true;
							      } 
							      catch (Exception e) {
							        e.printStackTrace();
							      }
							    }
							  }).start();

							flowers_jp.setLayout(gl_panel_1);
						
						} 
						catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
		   }
		}
}