const Task2 = () => {
	const items = [
		{id: 1, name: "Item1", price: 12.00},
		{id: 2, name: "Item2", price: 4.00},
		{id: 3, name: "Item3", price: 7.99}
	];

	const getItemList = () => {
		return (
			<ul>
				{
					items.map((item) =>
						<li>
							{item.name} - <span className={"errorTextColor"}>{item.price}</span>
						</li>)
				}
			</ul>
		)
	}

	return <>{getItemList()}</>
}

export default Task2;
