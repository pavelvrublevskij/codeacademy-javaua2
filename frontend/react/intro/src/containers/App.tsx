import React from 'react';
import Login from "./Login";
import Task2 from "../task/Task2";

function App() {
	return (
		<div>
			Uzd 1:
			<br/>
			pagal salyga ar admin ar user surenderint atitinkama rezultata (panaudoti skirtingus komponentus)
			<hr/>
			<Login loginName={'admin'} item1={100} item2={200}/>
			<Task2 />
		</div>
	);
}

export default App;
