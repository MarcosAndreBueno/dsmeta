import icon from '../../assets/img/notification-icon.svg';
import './styles.css';

function NotificationButton() {
  return (
    //className em react é o class do html
    <div className="dsmeta-red-btn">
      <img src={icon} alt="Notificar" />
    </div>
  )
}

export default NotificationButton;
