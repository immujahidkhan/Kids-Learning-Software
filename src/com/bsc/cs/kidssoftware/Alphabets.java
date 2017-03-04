package com.bsc.cs.kidssoftware;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Alphabets {

	private JButton[] alphabets = new JButton[26];
	private JLabel label = new JLabel("Kid's Learning Software");
	private String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
			"S", "T", "U", "V", "W", "X", "Y", "Z" };

	public Alphabets(JPanel alphabets_jp) {

		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 34));

		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = new JButton(names[i]);
			alphabets[i].setBorder(BorderFactory.createLineBorder(Color.black));
		}

		GroupLayout gl_panel1 = new GroupLayout(alphabets_jp);

		gl_panel1.setHorizontalGroup(gl_panel1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel1
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[0], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[13], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[1], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[14], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[2], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[15], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[3], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[16], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[4], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[17], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[5], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[18], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[6], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[19], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[7], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[20], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[8], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[21], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[9], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[22], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[10], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[23], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[11], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[24], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel1.createSequentialGroup()
								.addComponent(alphabets[12], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(42).addComponent(alphabets[25], GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(50, Short.MAX_VALUE))
				.addGroup(gl_panel1.createSequentialGroup().addContainerGap(201, Short.MAX_VALUE).addComponent(label)
						.addGap(193)));
		gl_panel1.setVerticalGroup(gl_panel1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel1
				.createSequentialGroup().addGap(20).addComponent(label).addContainerGap()
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[0], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[13], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[1], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[14], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[2], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[15], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[3], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[16], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[4], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[17], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[5], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[18], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[6], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[19], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[7], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[20], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[8], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[21], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[9], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[22], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[10], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[23], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[11], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[24], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5)
				.addGroup(gl_panel1.createParallelGroup(Alignment.BASELINE)
						.addComponent(alphabets[12], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(alphabets[25], GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGap(5).addContainerGap(43, Short.MAX_VALUE)));
		alphabets_jp.setLayout(gl_panel1);
		
		final JLabel lblNewLabel_1 = new JLabel();

		for (int i = 0; i < alphabets.length; i++) {
			final int n = i;

			alphabets[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {
					try {

						BufferedImage img = ImageIO.read(new File("assets/" + names[n] + ".jpg"));
						Image dimg = img.getScaledInstance(325, 350, Image.SCALE_SMOOTH);
						ImageIcon imageIcon = new ImageIcon(dimg);
						lblNewLabel_1.setIcon(imageIcon);
						gl_panel1.setHorizontalGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel1.createSequentialGroup()
										.addContainerGap(247, Short.MAX_VALUE).addComponent(lblNewLabel_1,
												GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
						gl_panel1.setVerticalGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel1
										.createSequentialGroup().addGap(65).addComponent(lblNewLabel_1,
												GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(100, Short.MAX_VALUE)));
						alphabets_jp.setLayout(gl_panel1);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	}

}