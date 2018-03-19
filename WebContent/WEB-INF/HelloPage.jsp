
<html>
<head>
  <link rel="stylesheet" href="styles.css">
  <style>
table, th, td {
    border: 1px solid white;
	color: white;
	size: "2";
}
.ribbon {
 font-size: 16px !important;
 /* This ribbon is based on a 16px font side and a 24px vertical rhythm. I've used em's to position each element for scalability. If you want to use a different font size you may have to play with the position of the ribbon elements */

 width: 50%;
    
 position: relative;
 background: white;
 color: black;
 text-align: center;
 padding: 1em 2em; /* Adjust to suit */
 margin: 2em auto 3em; /* Based on 24px vertical rhythm. 48px bottom margin - normally 24 but the ribbon 'graphics' take up 24px themselves so we double it. */
}

.ribbon .ribbon-content:before, .ribbon .ribbon-content:after {
 content: "";
 position: absolute;
 display: block;
 border-style: solid;
 border-color: #804f7c transparent transparent transparent;
 bottom: -1em;
}
.ribbon .ribbon-content:before {
 left: 0;
 border-width: 1em 0 0 1em;
}
.ribbon .ribbon-content:after {
 right: 0;
 border-width: 1em 1em 0 0;
}

#page-wrap {
     width: 800px;
     margin: 0 auto;
}
</style>
</head>
<body style="background-color:#1D1B1A  ;">
<div id="page-wrap">
<h1 class="ribbon">
   <strong class="ribbon-content">Errors</strong>
</h1>
<table style="width:100%" >
  <tr>
    <th>${f1}</th>
    <th>${f2}</th> 
    <th>${f3}</th>
	  <th>${f4}</th>
	 <th>${f5}</th>
    <th>${f6}</th> 
    <th>${f7}</th>
  </tr>
  ${rows} 
</table>
 </div>
</body>
</html>