class CreateUsers < ActiveRecord::Migration
  def up
    create_table :users do |t|
    	t.string "first_name" , :limit=>20
    	t.string "last_name"  , :limit=>20	
    	t.string "location"		
    	t.date "birth_date"
      t.string "gender"
      t.string "email"
      t.column :data, :binary, :limit => 10.megabyte
      t.timestamps null: false
    
    end
end
 
 def down 
 	drop_table :users
  end

end
