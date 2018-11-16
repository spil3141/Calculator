using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace calculator
{
    public partial class Form1 : Form
    {
        public bool newNumber = false;
        public double result = 0;
        public char indi;

        public Form1()
        {
            InitializeComponent();
        }


        public void calcul(char temp)
        {
            switch (temp)
            {
                case '+':
                    result += double.Parse(textBox1.Text);
                    break;
                case '-':
                    result -= double.Parse(textBox1.Text);
                    break;
                case '*':
                    result *= double.Parse(textBox1.Text);
                    break;
                case '/':
                    result /= double.Parse(textBox1.Text);
                    break;
            }
        }

        private void button7_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
            {
                textBox1.Text = "4";
            }
            else
            {
                textBox1.Text += "4";
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button15_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0" || newNumber == true)
            {
                textBox1.Text = "0";                
            }
            else
            {
                textBox1.Text += "0";
            }
            newNumber = false;
        }

        private void NumBtn1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0" || newNumber == true)
            {
                textBox1.Text = "1";
            }
            else
            {
                textBox1.Text += "1";
            }
            newNumber = false;
        }

        private void NumBtn2_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0" || newNumber == true)
            {
                textBox1.Text = "2";
            }
            else
            {
                textBox1.Text += "2";
            }
            newNumber = false;
        }

        private void NumBtn3_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0" || newNumber ==true)
            {
                textBox1.Text = "3";
            }
            else
            {
                textBox1.Text += "3";
            }
            newNumber = false;
        }

        private void NumBtn5_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0" || newNumber == true)
            {
                textBox1.Text = "5";
            }
            else
            {
                textBox1.Text += "5";
            }
            newNumber = false;
        }

        private void NumBtn6_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0" || newNumber == true)
            {
                textBox1.Text = "6";
            }
            else
            {
                textBox1.Text += "6";
            }
            newNumber = false;
        }

        private void NumBtn7_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0" || newNumber == true)
            {
                textBox1.Text = "7";
            }
            else
            {
                textBox1.Text += "7";
            }
            newNumber = false;
        }

        private void NumBtn8_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0"|| newNumber == true)
            {
                textBox1.Text = "8";
            }
            else
            {
                textBox1.Text += "8";
            }
            newNumber = false;
        }

        private void NumBtn9_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0" || newNumber == true)
            {
                textBox1.Text = "9";
            }
            else
            {
                textBox1.Text += "9";
            }
            newNumber = false;
        }

        private void PlusBtn_Click(object sender, EventArgs e)
        {
            
            if (label1.Text == "")
            {
                label1.Text = textBox1.Text + "+";
                result = double.Parse(textBox1.Text);
            }
            else
            {
                label1.Text += textBox1.Text + "+";
                calcul(indi);
                textBox1.Text = result.ToString();
            }
            newNumber = true;
            indi = '+';
        }

        private void MinusBtn_Click(object sender, EventArgs e)
        {
            
            if (label1.Text == "")
            {
                label1.Text = textBox1.Text + "-";
                result = double.Parse(textBox1.Text);
            }
            else
            {
                label1.Text += textBox1.Text + "-";
                calcul(indi);
                textBox1.Text = result.ToString();
            }
            newNumber = true;
            indi = '-';
        }

        private void MultiBtn_Click(object sender, EventArgs e)
        {
            
            if (label1.Text == "")
            {
                label1.Text = textBox1.Text + "*";
                result = double.Parse(textBox1.Text);
            }
            else
            {
                label1.Text += textBox1.Text + "*";
                calcul(indi);
                textBox1.Text = result.ToString();
            }
            newNumber = true;
            indi = '*';
        }

        private void DivBtn_Click(object sender, EventArgs e)
        {
            
            if (label1.Text == "")
            {
                label1.Text = textBox1.Text + "/";
                result = double.Parse(textBox1.Text);
            }
            else
            {
                label1.Text += textBox1.Text + "/";
                calcul(indi);
                textBox1.Text = result.ToString();
            }
            newNumber = true;
            indi = '/';
        }

        private void ClrBtn_Click(object sender, EventArgs e)
        {
            label1.Text = "";
            textBox1.Text = "0";
            result = 0.0;
            newNumber = false;
        }

        private void CalBtn_Click(object sender, EventArgs e)
        {
            calcul(indi);
            label1.Text = "";
            textBox1.Text = result.ToString();
        }

        private void DotBtn_Click(object sender, EventArgs e)
        {
            if(textBox1.Text.Contains(".") == false)
                textBox1.Text += ".";
        }
    }
}
