import AdminPage from "./AdminPage";
import UserPage from "./UserPage";

const Login = (props: any) => {

	const doLogin = (loginValue: any) => {
		if (loginValue === 'admin') {
			return <AdminPage value1={props.item1} value2={props.item2} loginName={props.value}/>;
		}

		return <UserPage loginName={props.value}/>;
	}

	return <div>{doLogin(props.value)}</div>
}

export default Login;
