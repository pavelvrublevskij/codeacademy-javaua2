import AdminPage from "./AdminPage/AdminPage";
import UserPage from "./UserPage/UserPage";

const Login = (props: any) => {

	const doLogin = (loginValue: any) => {
		if (loginValue === 'admin') {
			return <AdminPage {...props} />;
		}

		return <UserPage loginName={props.loginName}/>;
	}

	return <div>{doLogin(props.loginName)}</div>
}

export default Login;
