package assign1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField radiusInput;
	private JTextField circleAreaTextField;
	private JTextField circleRoundTextField;
	private JTextField triangleButtonTextField;
	private JTextField triangleHeightTextField;
	private JTextField rectangleSideATextField;
	private JTextField rectangleSideBTextField;
	private JTextField triangleOuputTextField;
	private JTextField rectangleOuputTextField;
	private JTextField rectangleRoundOuputTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("U10316036");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		
		JPanel circle = new JPanel();
		contentPane.add(circle);
		circle.setLayout(new BoxLayout(circle, BoxLayout.Y_AXIS));
		
		JPanel circleInput = new JPanel();
		circle.add(circleInput);
		
		JLabel radius = new JLabel("Radius:");
		circleInput.add(radius);
		
		radiusInput = new JTextField();
		circleInput.add(radiusInput);
		radiusInput.setColumns(10);
		
		JButton calCircle = new JButton("計算");
		calCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				circleAreaTextField.setText(""+Calculator.getCircleArea(Double.parseDouble(radiusInput.getText())));
				circleRoundTextField.setText(""+Calculator.getCirclePerimeter(Double.parseDouble(radiusInput.getText())));
			}
		});
		circleInput.add(calCircle);
		
		JButton resetCircle = new JButton("清空");
		resetCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				circleAreaTextField.setText("");
				circleRoundTextField.setText("");
			}
		});
		circleInput.add(resetCircle);
		
		JPanel circleAreaOutput = new JPanel();
		circle.add(circleAreaOutput);
		circleAreaOutput.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel circleAreaLabel = new JLabel("The circle area is:");
		circleAreaOutput.add(circleAreaLabel);
		
		circleAreaTextField = new JTextField();
		circleAreaOutput.add(circleAreaTextField);
		circleAreaTextField.setColumns(20);
		
		JPanel circleRoundOutput = new JPanel();
		circle.add(circleRoundOutput);
		
		JLabel circleRoundLabel = new JLabel("The circle perimeter is:");
		circleRoundOutput.add(circleRoundLabel);
		
		circleRoundTextField = new JTextField();
		circleRoundOutput.add(circleRoundTextField);
		circleRoundTextField.setColumns(20);
		
		JPanel triangle = new JPanel();
		contentPane.add(triangle);
		triangle.setLayout(new BoxLayout(triangle, BoxLayout.Y_AXIS));
		
		
		JPanel triangleInput = new JPanel();
		triangle.add(triangleInput);
		
		JLabel triangleButtonLabel = new JLabel("Button:");
		triangleInput.add(triangleButtonLabel);
		
		triangleButtonTextField = new JTextField();
		triangleButtonTextField.setColumns(5);
		triangleInput.add(triangleButtonTextField);
		
		JLabel triangleHeightLabel = new JLabel("Height:");
		triangleInput.add(triangleHeightLabel);
		
		triangleHeightTextField = new JTextField();
		triangleInput.add(triangleHeightTextField);
		triangleHeightTextField.setColumns(5);
		
		
		JButton triangleCal = new JButton("計算");
		triangleCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				triangleOuputTextField.setText(""+Calculator.getTriangleArea(Double.parseDouble(triangleButtonTextField.getText()), Double.parseDouble(triangleHeightTextField.getText())));
			}
		});
		triangleInput.add(triangleCal);
		
		JButton tirangleClean = new JButton("清空");
		tirangleClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				triangleButtonTextField.setText("");
				triangleHeightTextField.setText("");
				triangleOuputTextField.setText("");
			}
		});
		triangleInput.add(tirangleClean);
		
		JPanel triangleOutput = new JPanel();
		triangle.add(triangleOutput);
		triangleOutput.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel triangleOuputLabel = new JLabel("The triangle area is:");
		triangleOutput.add(triangleOuputLabel);
		
		triangleOuputTextField = new JTextField();
		triangleOuputTextField.setColumns(15);
		triangleOutput.add(triangleOuputTextField);
		
		
		JPanel rectangle = new JPanel();
		contentPane.add(rectangle);
		rectangle.setLayout(new BoxLayout(rectangle, BoxLayout.Y_AXIS));
		
		JPanel rectangleInput = new JPanel();
		rectangle.add(rectangleInput);
		
		JLabel rectangleSideALebel = new JLabel("Side:");
		rectangleInput.add(rectangleSideALebel);
		
		rectangleSideATextField = new JTextField();
		rectangleSideATextField.setColumns(7);
		rectangleInput.add(rectangleSideATextField);
		
		JLabel rectangleSideBLabel = new JLabel("Side:");
		rectangleInput.add(rectangleSideBLabel);
		
		rectangleSideBTextField = new JTextField();
		rectangleSideBTextField.setColumns(7);
		rectangleInput.add(rectangleSideBTextField);
		
		JButton rectangleCal = new JButton("計算");
		rectangleCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rectangleRoundOuputTextField.setText(""+Calculator.getRetangleRound(Double.parseDouble(rectangleSideATextField.getText()), Double.parseDouble(rectangleSideBTextField.getText())));
				rectangleOuputTextField.setText(""+Calculator.getRetangleArea(Double.parseDouble(rectangleSideATextField.getText()), Double.parseDouble(rectangleSideBTextField.getText())));
			}
		});
		rectangleInput.add(rectangleCal);
		
		JButton rectangleClean = new JButton("清空");
		rectangleClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rectangleSideATextField.setText("");
				rectangleSideBTextField.setText("");
				rectangleOuputTextField.setText("");
				rectangleRoundOuputTextField.setText("");
			}
		});
		rectangleInput.add(rectangleClean);
		
		JPanel rectangleOuput = new JPanel();
		rectangle.add(rectangleOuput);
		rectangleOuput.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel rectangleOutputLabel = new JLabel("The rectangle area is:");
		rectangleOuput.add(rectangleOutputLabel);
		
		rectangleOuputTextField = new JTextField();
		rectangleOuputTextField.setColumns(15);
		rectangleOuput.add(rectangleOuputTextField);
		
		JPanel rectangleRoundOuput = new JPanel();
		rectangle.add(rectangleRoundOuput);
		rectangleRoundOuput.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel rectangleRoundOutputLabel = new JLabel("The rectangle perimeter is:");
		rectangleRoundOuput.add(rectangleRoundOutputLabel);
		
		rectangleRoundOuputTextField = new JTextField();
		rectangleRoundOuput.add(rectangleRoundOuputTextField);
		rectangleRoundOuputTextField.setColumns(15);
	}

}
