import React from 'react';
import HeaderContainer from "./Header/HeaderContainer";
import ContentContainer from "./Content/ContentContainer";
import FooterContainer from "./Footer/FooterContainer";
import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";

function App() {
	return (
		<BrowserRouter>
			<div className={'mainApp'}>
				<HeaderContainer/>
				<Routes>
					<Route path={'/example'} element={ <ContentContainer /> } />
				</Routes>
				<FooterContainer/>
			</div>
		</BrowserRouter>
	);
}

export default App;
