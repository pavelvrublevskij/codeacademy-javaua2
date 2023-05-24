import React from 'react';
import Login from "./Login";

function App() {
	return (
		<div>
			Uzd 1:
			<br/>
			pagal salyga ar admin ar user surenderint atitinkama rezultata (panaudoti skirtingus komponentus)
			<hr/>
			<Login loginName={'admin'} item1={100} item2={200}/>
		</div>
	);
}

export default App;
