class CreateFriends < ActiveRecord::Migration
  def up
    create_table :friends do |t|
    	t.string "user_email1"
    	t.string "user_email2"

      t.timestamps null: false
    end
  end
def down 
	drop_table :friends
	end
end
