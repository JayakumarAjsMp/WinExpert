# WinExpert

It is Windows shortcut key quiz Desktop Application which is written in java Swing & AWT.
In this application all the mouse event are masked and it does not work inside the panel.
 In this application, question are displays randomly from database on the screen. When answer to question, participant wants press actually shortcut key.
 It get keystrokes from the keyboard and convert it into hasecode and add each hashcode and take as answer for that question. Then it compares answer with database if answer is correct then it take score has 1 else 0.
 After answered to the question the participant must press TAB and  ENTER , for next question.If participant fails to do it. Then it doesn't consider as answer and take score as 0 for that question.
 Timer is runs for each question. For each question 30 seconds of time. If participant doesn't answer within the time, it take score for that question is 0. 
 Then for each question, score is updated into the database.
During the quiz , Application cannot close/resize/maximize. And those option are masked for this application.
After finish the quiz. There is Finish button in final page to close the application. Only that button can close the application.

For Example,
 If the Question is given as, "What is shortcut key for copy ?". Participant want to press actual shortcut key as Ctrl+C, but not to written as Control , C. 
 Here for Ctrl hashcode is 18 and for C hashcode is 67, it adds both hashcodes then take it as answer for question. 
 Answer is 85 then it get original answer from database compare both values, if both are equal then update the score as score + 1 else score as old score.
 For next question Participant want to press TAB and ENTER...

Database:
For this application "Database name is db".
To store the participant details and score use the table name as "reg" in database.
To store and retrieve the question to the screen use the table name as "ques" in database.
Sample database are given at the end of this file.

Folder:
src\Login 
    Main.java 
      Simple loading page for application.
    Registrationn.java
      It is used to get the information about thre participants.
      Here the mouse event are masked and it does not work inside the panel.

src/Panel
    WinPanel.java
      It is a panel, used to mask all keystrokes.
 
 src/User
    QuestionGenerator.java
      Here all question are displayed to the screen, question are displays randomly from database on the screen. When we answer to question, we wants press actually shortcut key.
      Here the mouse event are masked and it does not work inside the panel.
      Here it get keystrokes from the keyboard and convert it into hasecode and add each hashcode and take as answer for that question.
      Then it compares answer with database if answer is correct then it take score has 1 else 0 then update the score as score.
       After answered to the question the participant must press TAB and  ENTER , for next question.If participant fails to do it. Then it doesn't consider as answer and take score as 0 for that question.
 Timer is runs for each question. For each question 30 seconds of time. If participant doesn't answer within the time, it take score for that question is 0. 
 Then for each question, score is updated into the database.
 
 src/User
    About.java
    It is final page of the application,after finish the quize it tells thanks to participant and there is finsh button in the panel it will close the application. 
      

Database: `db`
--

-- --------------------------------------------------------

--
-- Table structure for table `ques`
--

CREATE TABLE IF NOT EXISTS `ques` (
  `SNo` int(5) NOT NULL AUTO_INCREMENT,
  `Que` varchar(500) DEFAULT NULL,
  `Ans` int(11) DEFAULT NULL,
  PRIMARY KEY (`SNo`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=76 ;

--
-- Sample data for table `ques`
--

INSERT INTO `ques` (`SNo`, `Que`, `Ans`) VALUES
(1, 'What is the shortcut for copy ?', 84),
(2, 'What is the shortcut for cut ?', 105),
(3, 'What is the shortcut for paste in ?', 103),
(4, 'What is the shortcut for undo ?', 107),
(5, 'What is the shortcut for delete ?', 127),
(6, 'What is the shortcut key for delete the selected item permanently without placing the item in the Recycle bin ?', 143),
(7, 'What is the shortcut key for rename the selected item in ?', 113),
(8, 'What is the shortcut for select all ?', 82),
(9, 'What is the shortcut for search for files or folder in Windows XP ?', 114),
(10, 'What is the shortcut for view the properties for selected item in Windows XP ?', 28),
(11, 'What is the shortcut for close the active item or quit the active program?', 133),
(12, 'What is the shortcut for close the active document in programs that enable you to have multiple documents open simultaneously ?', 132),
(13, 'What is the shortcut for display the properties of selected object ?', 28),
(14, 'What is the shortcut for cycle through the item in the a windows or on the desktop ?', 117),
(15, 'What is the shortcut for display the address bar list my computer or windows explorer ?', 115),
(16, 'What is the shortcut for display the shortcut menu for the selected item Windows XP ?', 137),
(17, 'What is the shortcut for Active the menu bar in active program?', 127),
(18, 'What is the shortcut for update the active window?', 116),
(19, 'What is the shortcut for view the folder one level up in my computer or windows explorer ?', 38),
(20, 'What is the shortcut for cancel the current task ?', 38),
(21, 'What is the shortcut key perform the command for the active option or button ?', 10),
(22, 'What is the shortcut key for select or clear the check box if the active option is a check box ?', 32),
(23, 'What is the shortcut key for display or hide the start menu ?', 87),
(24, 'What is the shortcut key for display help', 112),
(25, 'What is the shortcut key for display the items in the active list', 115);

-- --------------------------------------------------------

--
-- Table structure for table `reg`
--

CREATE TABLE IF NOT EXISTS `reg` (
  `Name` varchar(50) NOT NULL,
  `Name1` varchar(50) NOT NULL,
  `Email` varchar(250) NOT NULL,
  `College` varchar(400) NOT NULL,
  `Phno` varchar(15) NOT NULL,
  `score` varchar(6) NOT NULL DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
--
-- Sample data for table `reg`
--

INSERT INTO `reg` (`Name`, `Name1`, `Email`, `College`, `Phno`, `score`) VALUES
('fdskh', 'sakj', 'sfdfs', 's', '32423', '0'),
('sdjf', 'jshdjsah', 'jhsudh', 'hds', '132342', '0'),
('siva', 'sdasd', 'SHGDHG2GM@TGJDF', 'HSDGKQGH', '9784376178', '0'),
('mhdhfj', 'hfidj', 'hjfi', 'hdisjj', '1224454', '0'),
('sdfs', 'gdcfkh', 'diofw', 'ksdjk', 'sdjk', '0');
      
